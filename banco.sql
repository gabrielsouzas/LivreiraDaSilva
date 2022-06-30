--
-- PostgreSQL database dump
--

-- Started on 2015-08-07 22:23:32

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = off;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET escape_string_warning = off;

SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 1492 (class 1259 OID 231830)
-- Dependencies: 3
-- Name: cidade; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE cidade (
    cidade_codigo integer NOT NULL,
    cidade_nome character varying(100),
    codigo_est integer
);


ALTER TABLE public.cidade OWNER TO postgres;

--
-- TOC entry 1493 (class 1259 OID 231835)
-- Dependencies: 3
-- Name: estado; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE estado (
    estado_codigo integer NOT NULL,
    estado_nome character varying(100)
);


ALTER TABLE public.estado OWNER TO postgres;

--
-- TOC entry 1776 (class 0 OID 231830)
-- Dependencies: 1492
-- Data for Name: cidade; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO cidade (cidade_codigo, cidade_nome, codigo_est) VALUES (1, 'Assis', 1);


--
-- TOC entry 1777 (class 0 OID 231835)
-- Dependencies: 1493
-- Data for Name: estado; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO estado (estado_codigo, estado_nome) VALUES (1, 'Sao Paulo');


--
-- TOC entry 1772 (class 2606 OID 231834)
-- Dependencies: 1492 1492
-- Name: cidade_codigo_pk; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY cidade
    ADD CONSTRAINT cidade_codigo_pk PRIMARY KEY (cidade_codigo);


--
-- TOC entry 1774 (class 2606 OID 231839)
-- Dependencies: 1493 1493
-- Name: estado_pk; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY estado
    ADD CONSTRAINT estado_pk PRIMARY KEY (estado_codigo);


--
-- TOC entry 1775 (class 2606 OID 231840)
-- Dependencies: 1773 1492 1493
-- Name: cidade_estado_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY cidade
    ADD CONSTRAINT cidade_estado_fk FOREIGN KEY (codigo_est) REFERENCES estado(estado_codigo);


--
-- TOC entry 1782 (class 0 OID 0)
-- Dependencies: 3
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2015-08-07 22:23:33

--
-- PostgreSQL database dump complete
--

