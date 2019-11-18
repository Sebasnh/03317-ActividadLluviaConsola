/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

        final int DIA_SEM = 7;
        final int MIN_LLUVIA = 0;
        final int MAX_LLUVIA = 500;

        int lluviaAct;
        int lluviaMax = 0;
        int lluviaMin = 0;
        int diaMax = 0;
        int diaMin = 0;
        int acumLluvia = 0;

        String nombreAct = "";
        String nombreMax = "";
        String nombreMin = "";

        System.out.println("Rango de lluvia aleatoria");
        System.out.println("===============");

        for (int diaAct = 0; diaAct < DIA_SEM; diaAct++) {

            lluviaAct = RND.nextInt(MAX_LLUVIA - MIN_LLUVIA + 1) + MIN_LLUVIA;

            if (diaAct == 0) {
                diaMax = diaAct;
                lluviaMax = lluviaAct;

            } else if (lluviaAct > lluviaMax) {
                diaMax = diaAct;
                lluviaMax = lluviaAct;
            }

            if (diaAct == 0) {
                diaMin = diaAct;
                lluviaMin = lluviaAct;

            } else if (lluviaAct < lluviaMin) {
                diaMin = diaAct;
                lluviaMin = lluviaAct;
            }

            acumLluvia += lluviaAct;

            switch (diaAct) {
                case 0:
                    nombreAct = "Lunes";
                    break;
                case 1:
                    nombreAct = "Martes";
                    break;
                case 2:
                    nombreAct = "Miércoles";
                    break;
                case 3:
                    nombreAct = "Jueves";
                    break;
                case 4:
                    nombreAct = "Viernes";
                    break;
                case 5:
                    nombreAct = "Sábado";
                    break;
                case 6:
                    nombreAct = "Domingo";
                    break;

            }

            System.out.printf("Lluvia %s ..: %d L/m2%n", nombreAct, lluviaAct);

            switch (diaMin) {
                case 0:
                    nombreMin = "Lunes";
                    break;
                case 1:
                    nombreMin = "Martes";
                    break;
                case 2:
                    nombreMin = "Miércoles";
                    break;
                case 3:
                    nombreMin = "Jueves";
                    break;
                case 4:
                    nombreMin = "Viernes";
                    break;
                case 5:
                    nombreMin = "Sábado";
                    break;
                case 6:
                    nombreMin = "Domingo";
                    break;

            }
            
            switch (diaMax) {
                case 0:
                    nombreMax = "Lunes";
                    break;
                case 1:
                    nombreMax = "Martes";
                    break;
                case 2:
                   nombreMax = "Miércoles";
                    break;
                case 3:
                    nombreMax = "Jueves";
                    break;
                case 4:
                   nombreMax = "Viernes";
                    break;
                case 5:
                    nombreMax = "Sábado";
                    break;
                case 6:
                   nombreMax = "Domingo";
                    break;
            }
        }
        
        System.out.println ("");
        
        System.out.println("Máximo, mínimo y media");
        System.out.println("======================");

        System.out.printf ("Día máximo de lluvia ......: %d L/m2 %s%n",lluviaMax, nombreMax);
        System.out.printf ("Día mínimo de lluvia ......: %d L/m2 %s%n",lluviaMin, nombreMin);
        System.out.printf ("Media lluvia semanal ......: %d L/m2%n",acumLluvia/DIA_SEM);
    }

}
