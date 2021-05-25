/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing.romano.testingnumromano.test;

/**
 *
 * @author cristo
 */
class NumRomano {

    String obtenerRomano(int numeroNatural) {

//        String romano = (numeroNatural == 3) ? "III" : (numeroNatural == 2) ? "II" : "I";
//        return romano;
//            logica de numeros romanos
        //declaramos variables para decomponer el numero que llega
        //u = unidad ; d = decena; c = centena; m = mil; i = iterador
        int u, d, c, m, i;
        //variable vacia para retornar el valor romano 
        String romano = "";

        //descomponer el numero quizas hay mejores metodos pero voy hacerlo a pie :)
//             
        m = numeroNatural / 1000;
        c = numeroNatural / 100 % 10;
        d = numeroNatural / 10 % 10;
        u = numeroNatural % 10;

        for (i = 1; i <= m; i++) {
            romano = romano + "M";
        }

        if (c == 9) {
            romano = romano + "CM";
        } else if (c >= 5) {
            romano = romano + "D";
            for (i = 6; i <= c; i++) {
                romano = romano + "C";
            }
        } else if (c == 4) {
            romano = romano + "CD";
        } else {
            for (i = 1; i <= c; i++) {
                romano = romano + "C";
            }
        }

        if (d == 9) {
            romano = romano + "XC";
        } else if (d >= 5) {
            romano = romano + "L";
            for (i = 6; i <= d; i++) {
                romano = romano + "X";
            }
        } else if (d == 4) {
            romano = romano + "XL";
        } else {
            for (i = 1; i <= d; i++) {
                romano = romano + "X";
            }
        }

        if (u == 9) {
            romano = romano + "IX";
        } else if (u >= 5) {
            romano = romano + "V";
            for (i = 6; i <= u; i++) {
                romano = romano + "I";
            }
        } else if (u == 4) {
            romano = romano + "IV";
        } else {
            for (i = 1; i <= u; i++) {
                romano = romano + "I";
            }
        }

        return romano;

    }

}
