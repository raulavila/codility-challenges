package com.raulavila.lesson03.genomicrangequery;

import java.util.EnumMap;
import java.util.Map;

public class Solution {

    private Map<Nucleotide, int[]> lastOccurrencesMap;

    public int[] solution(String sequence, int[] p, int[] q) {
        initLastOccurrencesMap(sequence);

        int M = p.length;

        int[] output = new int[M];

        for (int i = 0; i < M; i++) {
            int from = p[i];
            int to = q[i];

            int minimal = getMinimalFactor(from, to);
            output[i] = minimal;
        }

        return output;
    }

    private void initLastOccurrencesMap(String sequence) {
        lastOccurrencesMap = new EnumMap<>(Nucleotide.class);

        for (Nucleotide nucleotide : Nucleotide.values()) {
            lastOccurrencesMap.put(nucleotide, new int[sequence.length()]);
        }

        int lastA = -1;
        int lastC = -1;
        int lastG = -1;

        for (int i = 0; i < sequence.length(); i++) {
            char nucleotideChar = sequence.charAt(i);

            if (Nucleotide.A.toString().charAt(0) == nucleotideChar) {
                lastA = i;
            } else if (Nucleotide.C.toString().charAt(0) == nucleotideChar) {
                lastC = i;
            } else if (Nucleotide.G.toString().charAt(0) == nucleotideChar) {
                lastG = i;
            }

            lastOccurrencesMap.get(Nucleotide.A)[i] = lastA;
            lastOccurrencesMap.get(Nucleotide.C)[i] = lastC;
            lastOccurrencesMap.get(Nucleotide.G)[i] = lastG;
        }
    }

    private int getMinimalFactor(int from, int to) {

        int minimalFactor = 4;
        
        for (Nucleotide nucleotide : Nucleotide.values()) {
            int[] lastOccurrences = lastOccurrencesMap.get(nucleotide);

            if(lastOccurrences[to] >= from) {
                minimalFactor = nucleotide.getImpactFactor();
                break;
            }
        }

        return minimalFactor;
    }

    public static enum Nucleotide {
        A(1), C(2), G(3);

        private int impactFactor;

        Nucleotide(int impactFactor) {
            this.impactFactor = impactFactor;
        }

        public int getImpactFactor() {
            return impactFactor;
        }
    }
}
