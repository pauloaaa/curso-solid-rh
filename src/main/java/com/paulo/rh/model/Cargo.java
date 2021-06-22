package com.paulo.rh.model;

public enum Cargo {

    ASSISTENTE {
        @Override
        public Cargo getProximoCargo() {
            return ANALISTA;
        }
    },
    ANALISTA {
        @Override
        public Cargo getProximoCargo() {
            return ESPEIALISTA;
        }
    },
    ESPEIALISTA {
        @Override
        public Cargo getProximoCargo() {
            return GERENTE;
        }
    },
    GERENTE {
        @Override
        public Cargo getProximoCargo() {
            return GERENTE;
        }
    };

    public abstract Cargo getProximoCargo();
}
