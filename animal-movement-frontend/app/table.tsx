'use client';

import { InformationCircleIcon } from '@heroicons/react/24/solid';
import {
  Flex,
  Icon,
  Table,
  TableBody,
  TableCell,
  TableHead,
  TableHeaderCell,
  TableRow,
  Title
} from '@tremor/react';
import React from 'react';
import { Movement } from './lib/model';

export default function MovementTable({ movement }: { movement: Movement[] }) {
  return (
    <>
      <div>
        <Flex
          className="space-x-0.5"
          justifyContent="start"
          alignItems="center"
        >
          <Title> Movement History </Title>
          <Icon
            icon={InformationCircleIcon}
            variant="simple"
            tooltip="Shows movement history between farms"
          />
        </Flex>
      </div>
      <Table className="mt-6">
        <TableHead>
          <TableRow>
            <TableHeaderCell className="text-center">Date</TableHeaderCell>
            <TableHeaderCell className="text-center">Company</TableHeaderCell>
            <TableHeaderCell className="text-center">
              Origin Farm
            </TableHeaderCell>
            <TableHeaderCell className="text-center">
              Destination Farm
            </TableHeaderCell>
            <TableHeaderCell className="text-center">
              Animals Moved
            </TableHeaderCell>
            <TableHeaderCell className="text-center">Reason</TableHeaderCell>
            <TableHeaderCell className="text-center">Species</TableHeaderCell>
          </TableRow>
        </TableHead>

        <TableBody>
          {movement.map((item) => (
            <TableRow
              key={item.destinationFarm + '' + item.originFarm + '' + item.date}
            >
              <TableCell className="text-center">{item.date}</TableCell>
              <TableCell className="text-center">{item.company.name}</TableCell>
              <TableCell className="text-center">
                {item.originFarm.name}
              </TableCell>
              <TableCell className="text-center">
                {item.destinationFarm.name}
              </TableCell>
              <TableCell className="text-center">{item.numbersMoved}</TableCell>
              <TableCell className="text-center">
                {item.reason.reason}
              </TableCell>
              <TableCell className="text-center">
                {item.species.species}
              </TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </>
  );
}
