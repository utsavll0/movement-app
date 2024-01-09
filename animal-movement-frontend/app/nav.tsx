import React from 'react';
import { Disclosure } from '@headlessui/react';
import { Title } from '@tremor/react';

export default async function Nav() {
  return (
    <Disclosure as="nav" className="bg-white shadow-sm">
      <>
        <div className="mx-auto max-w-7xl px-4 sm:px-6 lg:px-8">
          <div className="h-16 container mx-auto flex items-center justify-center">
            <div>
              <Title className="text-2xl">
                Welcome to Movement Tracking App
              </Title>
            </div>
          </div>
        </div>
      </>
    </Disclosure>
  );
}
