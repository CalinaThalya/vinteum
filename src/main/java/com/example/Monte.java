package com.example;

public class Monte {
    private List<Carta> cartas;

    public Monte() {
        cartas = new ArrayList<>();
        criarBaralho();
    }

    private void criarBaralho() {
        for (Naipe naipe : Naipe.values()) {
            for (Valor valor : Valor.values()) {
                Carta carta = new Carta(naipe, valor);
                cartas.add(carta);
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public Carta virar() {
        if (!cartas.isEmpty()) {
            return cartas.remove(0);
        } else {
    
            return null;
        }
    }
}
