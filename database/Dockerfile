FROM postgres:14.10
EXPOSE 5432

RUN mkdir -p /tmp/psql_data/

COPY ./seed.sql /tmp/psql_data/
COPY ./seed.sh /docker-entrypoint-initdb.d/