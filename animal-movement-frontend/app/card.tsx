import { Card, Text, Metric, Flex } from '@tremor/react';
import React from 'react';

export default function DisplayCard({
  text,
  value
}: {
  text: string;
  value: number;
}) {
  return (
    <Card
      key={text}
      className="mx-auto"
      decoration="top"
      decorationColor="indigo"
    >
      <Flex flexDirection="col" justifyContent="center" alignItems="center">
        <Text className="text-2xl">{text}</Text>
        <Metric className="text-7xl">{value}</Metric>
      </Flex>
    </Card>
  );
}
