export interface Movement {
  numbersMoved: number;
  date: string;
  originFarm: Farm;
  destinationFarm: Farm;
  company: Company;
  reason: Reason;
  species: Species;
}

export interface Farm {
  id: string;
  name: string;
  address: string;
  city: string;
  state: string;
  postalCode: string;
  latitude: number;
  longitude: number;
  population: Population;
}

export interface Population {
  premId: string;
  population: number;
}

export interface Company {
  id: number;
  name: string;
}

export interface Reason {
  id: number;
  reason: string;
}

export interface Species {
  id: number;
  species: string;
}

export interface Count {
  count: number;
}

export interface FarmMovementCount {
  farm: Farm;
  totalMovedFrom: number;
  totalMovedTo: number;
}

export interface AnimalMovementFarmData {
  farmName: string;
  'Outgoing Animals': number;
  'Incoming Animals': number;
}

export interface SpeciesData {
  name: string;
  count: number;
}

export interface PieData {
  name: string;
  count: number;
}

export interface SpeciesCount {
  species: Species;
  count: number;
}

export interface AnimalCompanyCount {
  companyId: number;
  animalMoved: number;
  companyName: string;
}

export interface TotalData {
  totalFarms: Count;
  totalAnimals: Count;
  totalAnimalsMoved: Count;
  totalAnimalsMovedInFarm: FarmMovementCount[];
  speciesCount: SpeciesCount[];
  companyAnimalCount: AnimalCompanyCount[];
  movementData: Movement[];
}
