import { Title, Text } from '@tremor/react';
import React from 'react';

export default function Loading() {
  return (
    <main className="text-center">
      <Title className="text-primary">Loading...</Title>
      <Text>Please wait till data loads</Text>
    </main>
  );
}
