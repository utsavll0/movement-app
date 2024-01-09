import React from 'react';
import { AnimalMovementFarmData } from './lib/model';
import { BarChart, Title, Card } from '@tremor/react';

export default function GroupedChart({
  graphData
}: {
  graphData: AnimalMovementFarmData[];
}) {
  return (
    <div className="mt-6">
      <Card decoration="top" decorationColor="indigo">
        <Title className="text-center">Animal Movement by Farm</Title>
        <BarChart
          className="mt-6"
          data={graphData}
          index="farmName"
          categories={['Outgoing Animals', 'Incoming Animals']}
          colors={['indigo', 'amber']}
          showAnimation={true}
          yAxisWidth={35}
        />
      </Card>
    </div>
  );
}
