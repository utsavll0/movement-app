SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: company; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.company (
    company_id integer NOT NULL,
    company_name character varying(30) NOT NULL
);


--
-- Name: farm; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.farm (
    prem_id character varying NOT NULL,
    name character varying NOT NULL,
    address character varying NOT NULL,
    city character varying NOT NULL,
    state character varying NOT NULL,
    postal_code character varying NOT NULL,
    lat numeric NOT NULL,
    long numeric NOT NULL
);


--
-- Name: movement; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.movement (
    id integer NOT NULL,
    company_id integer NOT NULL,
    reason_id integer NOT NULL,
    species_id integer NOT NULL,
    origin_farm_id character varying NOT NULL,
    dest_farm_id character varying NOT NULL,
    number_moved integer NOT NULL,
    date date NOT NULL
);


--
-- Name: population; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.population (
    prem_id character varying NOT NULL,
    population integer NOT NULL,
    id integer NOT NULL
);


--
-- Name: reason; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.reason (
    id integer NOT NULL,
    reason character varying(50)
);


--
-- Name: species; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.species (
    id integer NOT NULL,
    species character varying NOT NULL
);


--
-- Data for Name: company; Type: TABLE DATA; Schema: public; Owner: -
--

COPY public.company (company_id, company_name) FROM stdin;
1	Mypigcompany
2	MyPigCompany2
3	MyPigCompany3
\.


--
-- Data for Name: farm; Type: TABLE DATA; Schema: public; Owner: -
--

COPY public.farm (prem_id, name, address, city, state, postal_code, lat, long) FROM stdin;
F001	Green Acres	163 Fake Street	Albion	NC	62321	42.04312	-94.73784
F002	Sunny Fields	456 Mock Avenue	Springfield	IL	62701	39.79876	-89.64463
F003	Maple Grove Farm	789 Imaginary Lane	Meadowville	NY	12345	43.67890	-76.54321
F004	Golden Harvest Ranch	321 Fictional Road	Sunshine City	CA	98765	36.12345	-120.87654
F005	Prairie View Farm	555 Dream Street	Dreamland	TX	75001	32.98675	-96.98765
F006	Whispering Pines Farm	777 Fantasy Lane	Enchanted Village	FL	54321	27.34567	-81.23456
F007	Meadowland Farms	1011 Whimsical Avenue	Fairytale City	WA	98001	47.56789	-122.34567
F008	Harmony Hills Ranch	1313 Magic Road	Wonderland	AZ	85001	33.45678	-111.23456
F009	Emerald Valley Farm	1515 Mystic Street	Mysticville	MA	02101	42.78901	-71.12345
F010	Tranquil Meadows	1818 Serenity Lane	Calmville	OR	97201	45.67890	-122.98765
F011	Silent Woods Farm	2121 Tranquility Road	Peaceful Town	CO	80201	39.01234	-105.67890
F012	Sunrise Acres	2424 Sunrise Avenue	Hopeful Springs	GA	30301	33.34567	-84.56789
F013	Starlight Ranch	2727 Stardust Lane	Starry City	NV	89101	36.78901	-115.43210
F014	Gentle Breeze Farms	3030 Calm Street	Serenityville	UT	84101	40.12345	-111.98765
F015	Rainbow Fields	3333 Harmony Road	Joyful Junction	OH	44101	41.23456	-81.34567
F016	Majestic Meadows	3636 Majestic Lane	Royal City	MI	48201	42.56789	-83.23456
F017	Wholesome Haven	3939 Tranquil Avenue	Contentment Village	WI	53201	43.90123	-87.67890
F018	Mystical Ranch	4242 Enchantment Street	Magical Springs	OK	73101	35.34567	-97.12345
F019	Peaceful Pastures	4545 Peace Lane	Tranquility Falls	SC	29201	33.78901	-81.98765
F020	Dreamy Hollow Farm	4848 Dream Avenue	Fantasy Falls	KY	40201	38.12345	-85.67890
\.


--
-- Data for Name: movement; Type: TABLE DATA; Schema: public; Owner: -
--

COPY public.movement (id, company_id, reason_id, species_id, origin_farm_id, dest_farm_id, number_moved, date) FROM stdin;
1	1	1	1	F001	F005	500	2023-01-15
2	2	2	2	F002	F008	300	2023-02-10
3	3	3	1	F003	F011	800	2023-03-05
4	1	4	2	F004	F014	400	2023-04-20
5	2	5	1	F005	F017	700	2023-05-15
6	3	1	2	F006	F020	250	2023-06-10
7	1	2	1	F007	F003	1000	2023-07-05
8	2	3	2	F008	F006	450	2023-08-20
9	3	4	1	F009	F009	600	2023-09-15
10	1	5	2	F010	F012	750	2023-10-10
11	2	1	1	F011	F015	900	2023-11-05
12	3	2	2	F012	F018	200	2023-12-20
13	1	3	1	F013	F001	1100	2024-01-15
14	2	4	2	F014	F004	350	2024-02-10
15	3	5	1	F015	F007	500	2024-03-05
16	1	1	2	F016	F010	650	2024-04-20
17	2	2	1	F017	F013	800	2024-05-15
18	3	3	2	F018	F016	950	2024-06-10
19	1	4	1	F019	F019	300	2024-07-05
20	2	5	2	F020	F002	450	2024-08-20
21	1	1	1	F001	F004	200	2023-03-01
22	2	2	2	F002	F007	600	2023-04-15
23	3	3	1	F003	F010	750	2023-05-10
24	1	4	2	F004	F013	400	2023-06-25
25	2	5	1	F005	F016	550	2023-07-20
26	3	1	2	F006	F019	700	2023-08-15
27	1	2	1	F007	F002	850	2023-09-10
28	2	3	2	F008	F005	1000	2023-10-05
29	3	4	1	F009	F008	1150	2023-11-20
30	1	5	2	F010	F011	1300	2023-12-15
31	2	1	1	F003	F006	250	2024-01-10
32	3	2	2	F005	F009	450	2024-02-05
33	1	3	1	F007	F012	700	2024-03-20
34	2	4	2	F009	F015	900	2024-04-15
35	3	5	1	F011	F018	1100	2024-05-10
\.


--
-- Data for Name: population; Type: TABLE DATA; Schema: public; Owner: -
--

COPY public.population (prem_id, population, id) FROM stdin;
F001	1000	1
F002	1500	2
F003	750	3
F004	2000	4
F005	1200	5
F006	900	6
F007	1800	7
F008	2500	8
F009	1100	9
F010	1600	10
F011	1300	11
F012	1700	12
F013	800	13
F014	1400	14
F015	1900	15
F016	950	16
F017	1200	17
F018	2000	18
F019	1500	19
F020	1800	20
\.


--
-- Data for Name: reason; Type: TABLE DATA; Schema: public; Owner: -
--

COPY public.reason (id, reason) FROM stdin;
1	FINISH TO FINISH
2	SOW TO FINISH
3	SOW TO NURSERY
4	WTF TO FINISH
5	SOW TO WTF
\.


--
-- Data for Name: species; Type: TABLE DATA; Schema: public; Owner: -
--

COPY public.species (id, species) FROM stdin;
1	Swine
2	Cow
\.


--
-- Name: company company_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.company
    ADD CONSTRAINT company_pkey PRIMARY KEY (company_id);


--
-- Name: farm farm_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.farm
    ADD CONSTRAINT farm_pkey PRIMARY KEY (prem_id);


--
-- Name: movement movement_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.movement
    ADD CONSTRAINT movement_pkey PRIMARY KEY (id);


--
-- Name: population population_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.population
    ADD CONSTRAINT population_pkey PRIMARY KEY (id);


--
-- Name: reason reason_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.reason
    ADD CONSTRAINT reason_pkey PRIMARY KEY (id);


--
-- Name: species species_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.species
    ADD CONSTRAINT species_pkey PRIMARY KEY (id);


--
-- Name: movement company_id; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.movement
    ADD CONSTRAINT company_id FOREIGN KEY (company_id) REFERENCES public.company(company_id);


--
-- Name: movement dest_farm_id; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.movement
    ADD CONSTRAINT dest_farm_id FOREIGN KEY (dest_farm_id) REFERENCES public.farm(prem_id);


--
-- Name: movement origin_farm_id; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.movement
    ADD CONSTRAINT origin_farm_id FOREIGN KEY (origin_farm_id) REFERENCES public.farm(prem_id);


--
-- Name: population prem_id; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.population
    ADD CONSTRAINT prem_id FOREIGN KEY (prem_id) REFERENCES public.farm(prem_id);


--
-- Name: movement reason_id; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.movement
    ADD CONSTRAINT reason_id FOREIGN KEY (reason_id) REFERENCES public.reason(id);


--
-- Name: movement species_id; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.movement
    ADD CONSTRAINT species_id FOREIGN KEY (species_id) REFERENCES public.species(id);


--
-- PostgreSQL database dump complete
--

