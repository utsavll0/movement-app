import React, { Suspense } from 'react';
import Dashboard from './dashboard';
import Loading from './loading';

export const metadata = {
  title: 'Movement App'
};

export default async function IndexFunction() {
  return (
    <>
      <Suspense fallback={<Loading />}>
        <Dashboard />
      </Suspense>
    </>
  );
}
