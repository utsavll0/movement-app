import {
  AnimalCompanyCount,
  AnimalMovementFarmData,
  FarmMovementCount,
  PieData,
  SpeciesCount
} from './model';

export function toAnimalMovementFarmData(
  farmMovementData: FarmMovementCount[]
): AnimalMovementFarmData[] {
  return farmMovementData.map((x) => {
    return {
      farmName: x.farm.name,
      'Outgoing Animals': x.totalMovedFrom,
      'Incoming Animals': x.totalMovedTo
    };
  });
}

export function toSpeciesData(speciesCount: SpeciesCount[]): PieData[] {
  return speciesCount.map((x) => {
    return {
      name: x.species.species,
      count: x.count
    };
  });
}

export function toCompanyData(
  companyMovementData: AnimalCompanyCount[]
): PieData[] {
  return companyMovementData.map((x) => {
    return {
      name: x.companyName,
      count: x.animalMoved
    };
  });
}
