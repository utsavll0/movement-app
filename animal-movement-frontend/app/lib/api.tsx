import {
  AnimalCompanyCount,
  Count,
  FarmMovementCount,
  Movement,
  SpeciesCount,
  TotalData
} from './model';

const BACKEND_BASE_URL: string = 'http://localhost:8080';

export async function getAllData(): Promise<TotalData> {
  return {
    totalFarms: await getTotalFarms(),
    totalAnimals: await getTotalAnimals(),
    totalAnimalsMoved: await getTotalAnimalsMoved(),
    totalAnimalsMovedInFarm: await getTotalAnimalMovement(),
    speciesCount: await getSpeciesCount(),
    companyAnimalCount: await getAnimalsByCompany(),
    movementData: await getMovement()
  };
}

export async function getTotalFarms(): Promise<Count> {
  return (await fetch(BACKEND_BASE_URL + '/farm/count')).json();
}

export async function getTotalAnimals(): Promise<Count> {
  return (await fetch(BACKEND_BASE_URL + '/population/count')).json();
}

export async function getTotalAnimalsMoved(): Promise<Count> {
  return (await fetch(BACKEND_BASE_URL + '/movement/count')).json();
}

export async function getTotalAnimalMovement(): Promise<FarmMovementCount[]> {
  return (await fetch(BACKEND_BASE_URL + '/movement/total')).json();
}

export async function getSpeciesCount(): Promise<SpeciesCount[]> {
  return (await fetch(BACKEND_BASE_URL + '/movement/species')).json();
}

export async function getAnimalsByCompany(): Promise<AnimalCompanyCount[]> {
  return (await fetch(BACKEND_BASE_URL + '/movement/company')).json();
}

export async function getMovement(): Promise<Movement[]> {
  return (await fetch(BACKEND_BASE_URL + '/movement/')).json();
}
