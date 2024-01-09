'use client';

import React, { useEffect, useState } from 'react';
import {
  Card,
  Grid,
  Tab,
  TabGroup,
  TabList,
  TabPanel,
  TabPanels,
  Text,
  Title
} from '@tremor/react';
import { AnimalMovementFarmData, PieData, TotalData } from './lib/model';
import DisplayCard from './card';
import GroupedChart from './graph';
import PieChart from './pie';
import MovementTable from './table';
import {
  toAnimalMovementFarmData,
  toCompanyData,
  toSpeciesData
} from './lib/mappers';
import { getAllData } from './lib/api';

export default function Dashboard() {
  const [totalData, setTotalData] = useState<TotalData>();

  useEffect(() => {
    getAllData().then((data) => {
      setTotalData(data);
    });
  }, []);

  if (totalData) {
    const data: AnimalMovementFarmData[] = toAnimalMovementFarmData(
      totalData.totalAnimalsMovedInFarm
    );
    const speciesData: PieData[] = toSpeciesData(totalData.speciesCount);
    const companyData: PieData[] = toCompanyData(totalData.companyAnimalCount);

    return (
      <main className="p-12">
        <Title>Movement Dashboard</Title>
        <Text>
          This dashboard lets you analze farm animal movement across farms
        </Text>
        <TabGroup className="mt-6">
          <TabList>
            <Tab>Overview</Tab>
            <Tab>Detail</Tab>
          </TabList>
          <TabPanels>
            <TabPanel>
              <Grid numItemsMd={2} numItemsLg={3} className="gap-6 mt-6">
                <DisplayCard
                  text="Total Farms"
                  value={totalData.totalFarms.count}
                />
                <DisplayCard
                  text="Total Animals In Farm"
                  value={totalData.totalAnimals.count}
                />
                <DisplayCard
                  text="Total Animals Moved"
                  value={totalData.totalAnimalsMoved.count}
                />
              </Grid>
              <GroupedChart graphData={data} />
              <Grid numItemsLg={2} className="gap-6 mt-6 ">
                <PieChart
                  graphData={speciesData}
                  title="Count of animals moved by species"
                ></PieChart>
                <PieChart
                  graphData={companyData}
                  title="Count of animals moved by company"
                ></PieChart>
              </Grid>
            </TabPanel>
            <TabPanel>
              <div className="mt-6">
                <Card>
                  <MovementTable movement={totalData.movementData} />
                </Card>
              </div>
            </TabPanel>
          </TabPanels>
        </TabGroup>
      </main>
    );
  }
}
