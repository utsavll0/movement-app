import React from 'react';
import { Card, Title, DonutChart } from '@tremor/react';
import { PieData } from './lib/model';

export default function PieChart({
  graphData,
  title
}: {
  graphData: PieData[];
  title: string;
}) {
  return (
    <Card className="max-w-xlg" decoration="top" decorationColor="indigo">
      <Title className="text-center">{title}</Title>
      <DonutChart
        className="mt-6"
        data={graphData}
        category="count"
        index="name"
        colors={['indigo', 'amber', 'blue', 'green']}
      />
    </Card>
  );
}
