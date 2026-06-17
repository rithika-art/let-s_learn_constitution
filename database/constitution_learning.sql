--
-- PostgreSQL database dump
--

\restrict V7NBDn7n7klGqRx0CPeTW4vxAbumLsIxrbsl54PHTKmNHfNMRn8shDenwdEr915

-- Dumped from database version 16.11
-- Dumped by pg_dump version 16.11

-- Started on 2026-06-17 14:32:53

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
-- TOC entry 218 (class 1259 OID 24740)
-- Name: modules; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.modules (
    module_id integer NOT NULL,
    title character varying(200) NOT NULL,
    description text,
    content text
);


ALTER TABLE public.modules OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 24739)
-- Name: modules_module_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.modules_module_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.modules_module_id_seq OWNER TO postgres;

--
-- TOC entry 4890 (class 0 OID 0)
-- Dependencies: 217
-- Name: modules_module_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.modules_module_id_seq OWNED BY public.modules.module_id;


--
-- TOC entry 224 (class 1259 OID 24781)
-- Name: progress; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.progress (
    progress_id integer NOT NULL,
    user_id integer,
    module_id integer,
    completion_status character varying(20),
    last_accessed timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


ALTER TABLE public.progress OWNER TO postgres;

--
-- TOC entry 223 (class 1259 OID 24780)
-- Name: progress_progress_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.progress_progress_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.progress_progress_id_seq OWNER TO postgres;

--
-- TOC entry 4891 (class 0 OID 0)
-- Dependencies: 223
-- Name: progress_progress_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.progress_progress_id_seq OWNED BY public.progress.progress_id;


--
-- TOC entry 220 (class 1259 OID 24749)
-- Name: quiz; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.quiz (
    quiz_id integer NOT NULL,
    module_id integer,
    question text NOT NULL,
    option_a character varying(255),
    option_b character varying(255),
    option_c character varying(255),
    option_d character varying(255),
    correct_answer character varying(255)
);


ALTER TABLE public.quiz OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 24748)
-- Name: quiz_quiz_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.quiz_quiz_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.quiz_quiz_id_seq OWNER TO postgres;

--
-- TOC entry 4892 (class 0 OID 0)
-- Dependencies: 219
-- Name: quiz_quiz_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.quiz_quiz_id_seq OWNED BY public.quiz.quiz_id;


--
-- TOC entry 222 (class 1259 OID 24763)
-- Name: results; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.results (
    result_id integer NOT NULL,
    user_id integer,
    quiz_id integer,
    score integer,
    attempt_date timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


ALTER TABLE public.results OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 24762)
-- Name: results_result_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.results_result_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.results_result_id_seq OWNER TO postgres;

--
-- TOC entry 4893 (class 0 OID 0)
-- Dependencies: 221
-- Name: results_result_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.results_result_id_seq OWNED BY public.results.result_id;


--
-- TOC entry 216 (class 1259 OID 24731)
-- Name: users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.users (
    user_id integer NOT NULL,
    name character varying(100) NOT NULL,
    email character varying(100) NOT NULL,
    password character varying(255) NOT NULL,
    role character varying(20) NOT NULL
);


ALTER TABLE public.users OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 24730)
-- Name: users_user_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.users_user_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.users_user_id_seq OWNER TO postgres;

--
-- TOC entry 4894 (class 0 OID 0)
-- Dependencies: 215
-- Name: users_user_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.users_user_id_seq OWNED BY public.users.user_id;


--
-- TOC entry 4709 (class 2604 OID 24743)
-- Name: modules module_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.modules ALTER COLUMN module_id SET DEFAULT nextval('public.modules_module_id_seq'::regclass);


--
-- TOC entry 4713 (class 2604 OID 24784)
-- Name: progress progress_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.progress ALTER COLUMN progress_id SET DEFAULT nextval('public.progress_progress_id_seq'::regclass);


--
-- TOC entry 4710 (class 2604 OID 24752)
-- Name: quiz quiz_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.quiz ALTER COLUMN quiz_id SET DEFAULT nextval('public.quiz_quiz_id_seq'::regclass);


--
-- TOC entry 4711 (class 2604 OID 24766)
-- Name: results result_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.results ALTER COLUMN result_id SET DEFAULT nextval('public.results_result_id_seq'::regclass);


--
-- TOC entry 4708 (class 2604 OID 24734)
-- Name: users user_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users ALTER COLUMN user_id SET DEFAULT nextval('public.users_user_id_seq'::regclass);


--
-- TOC entry 4878 (class 0 OID 24740)
-- Dependencies: 218
-- Data for Name: modules; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.modules (module_id, title, description, content) FROM stdin;
1	Introduction to Constitution	Basic concepts of Indian Constitution	The Constitution of India is the supreme law of India.
\.


--
-- TOC entry 4884 (class 0 OID 24781)
-- Dependencies: 224
-- Data for Name: progress; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.progress (progress_id, user_id, module_id, completion_status, last_accessed) FROM stdin;
\.


--
-- TOC entry 4880 (class 0 OID 24749)
-- Dependencies: 220
-- Data for Name: quiz; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.quiz (quiz_id, module_id, question, option_a, option_b, option_c, option_d, correct_answer) FROM stdin;
1	1	When was the Indian Constitution adopted?	1947	1948	1949	1950	1949
\.


--
-- TOC entry 4882 (class 0 OID 24763)
-- Dependencies: 222
-- Data for Name: results; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.results (result_id, user_id, quiz_id, score, attempt_date) FROM stdin;
\.


--
-- TOC entry 4876 (class 0 OID 24731)
-- Dependencies: 216
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.users (user_id, name, email, password, role) FROM stdin;
1	Rahul	rahul@gmail.com	123456	Student
2	Admin	admin@gmail.com	admin123	Admin
\.


--
-- TOC entry 4895 (class 0 OID 0)
-- Dependencies: 217
-- Name: modules_module_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.modules_module_id_seq', 1, true);


--
-- TOC entry 4896 (class 0 OID 0)
-- Dependencies: 223
-- Name: progress_progress_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.progress_progress_id_seq', 1, false);


--
-- TOC entry 4897 (class 0 OID 0)
-- Dependencies: 219
-- Name: quiz_quiz_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.quiz_quiz_id_seq', 1, true);


--
-- TOC entry 4898 (class 0 OID 0)
-- Dependencies: 221
-- Name: results_result_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.results_result_id_seq', 1, false);


--
-- TOC entry 4899 (class 0 OID 0)
-- Dependencies: 215
-- Name: users_user_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.users_user_id_seq', 2, true);


--
-- TOC entry 4720 (class 2606 OID 24747)
-- Name: modules modules_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.modules
    ADD CONSTRAINT modules_pkey PRIMARY KEY (module_id);


--
-- TOC entry 4726 (class 2606 OID 24787)
-- Name: progress progress_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.progress
    ADD CONSTRAINT progress_pkey PRIMARY KEY (progress_id);


--
-- TOC entry 4722 (class 2606 OID 24756)
-- Name: quiz quiz_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.quiz
    ADD CONSTRAINT quiz_pkey PRIMARY KEY (quiz_id);


--
-- TOC entry 4724 (class 2606 OID 24769)
-- Name: results results_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.results
    ADD CONSTRAINT results_pkey PRIMARY KEY (result_id);


--
-- TOC entry 4716 (class 2606 OID 24738)
-- Name: users users_email_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_email_key UNIQUE (email);


--
-- TOC entry 4718 (class 2606 OID 24736)
-- Name: users users_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (user_id);


--
-- TOC entry 4730 (class 2606 OID 24793)
-- Name: progress progress_module_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.progress
    ADD CONSTRAINT progress_module_id_fkey FOREIGN KEY (module_id) REFERENCES public.modules(module_id);


--
-- TOC entry 4731 (class 2606 OID 24788)
-- Name: progress progress_user_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.progress
    ADD CONSTRAINT progress_user_id_fkey FOREIGN KEY (user_id) REFERENCES public.users(user_id);


--
-- TOC entry 4727 (class 2606 OID 24757)
-- Name: quiz quiz_module_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.quiz
    ADD CONSTRAINT quiz_module_id_fkey FOREIGN KEY (module_id) REFERENCES public.modules(module_id);


--
-- TOC entry 4728 (class 2606 OID 24775)
-- Name: results results_quiz_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.results
    ADD CONSTRAINT results_quiz_id_fkey FOREIGN KEY (quiz_id) REFERENCES public.quiz(quiz_id);


--
-- TOC entry 4729 (class 2606 OID 24770)
-- Name: results results_user_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.results
    ADD CONSTRAINT results_user_id_fkey FOREIGN KEY (user_id) REFERENCES public.users(user_id);


-- Completed on 2026-06-17 14:32:55

--
-- PostgreSQL database dump complete
--

\unrestrict V7NBDn7n7klGqRx0CPeTW4vxAbumLsIxrbsl54PHTKmNHfNMRn8shDenwdEr915

