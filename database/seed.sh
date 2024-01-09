#!/bin/bash

DB_DUMP_LOCATION="/tmp/psql_data/seed.sql"

echo "*** CREATING DATABASE ***"

psql -d movement -U postgres < "$DB_DUMP_LOCATION";

echo "*** DATABASE CREATED! ***"
