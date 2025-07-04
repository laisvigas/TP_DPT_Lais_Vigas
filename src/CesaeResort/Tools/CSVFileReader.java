package CesaeResort.Tools;
import CesaeResort.Models.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVFileReader {

    public ArrayList<Quarto> quartosFileReader(String filePath) throws FileNotFoundException {

        // Abrimos o ficheiro e criamos um Scanner associado
        File quartosFile = new File(filePath);
        Scanner quartosScanner = new Scanner(quartosFile);

        // Criamos o ArrayList de Quartos, vazio
        ArrayList<Quarto> quartosArray = new ArrayList<>();

        // Avançar o cabeçalho
        quartosScanner.nextLine();

        // Ciclo que vai correr para cada linha do ficheiro
        while (quartosScanner.hasNextLine()) {

            // Apanhamos a linha
            String linha = quartosScanner.nextLine();

            // Separamos a linha, com base no seu separador ","
            String[] linhaSeparada = linha.split(",");

            // Reunir todas as informações do Quarto
            int numQuarto = Integer.parseInt(linhaSeparada[0]);
            int idTipologia = Integer.parseInt(linhaSeparada[1]);

            // Criar novo Quarto
            Quarto newQuarto = new Quarto(numQuarto, idTipologia);

            // Adicionamos ao Array
            quartosArray.add(newQuarto);
        }

        // Terminando o ciclo (não há mais linhas)
        return quartosArray;
    }

    public ArrayList<Tipologia> tipologiaFileReader(String filePath) throws FileNotFoundException {
        File tipologiaFile = new File(filePath);
        Scanner tipologiaScanner = new Scanner(tipologiaFile);

        // Criamos o ArrayList de tipologia, vazio
        ArrayList<Tipologia> tipoologiaArray = new ArrayList<>();

        // Avançar o cabeçalho
        tipologiaScanner.nextLine();

        // Ciclo que vai correr para cada linha do ficheiro
        while (tipologiaScanner.hasNextLine()) {

            // Apanhamos a linha
            String linha = tipologiaScanner.nextLine();

            // Separamos a linha, com base no seu separador ","
            String[] linhaSeparada = linha.split(",");

            // Reunir todas as informações da tipologia
            String idQuarto = linhaSeparada[0];
            String descricao = linhaSeparada[1];
            float precoSemana = Float.parseFloat(linhaSeparada[2]);

            // Criar nova tipologia
            Tipologia newTipologia = new Tipologia(idQuarto, descricao, precoSemana);

            // Adicionamos ao Array
            tipoologiaArray.add(newTipologia);
        }

        // Terminando o ciclo (não há mais linhas)
        return tipoologiaArray;
    }

    public ArrayList<User> usersFileReader(String filePath) throws FileNotFoundException {

        // Abrimos o ficheiro e criamos um Scanner associado
        File usersFile = new File(filePath);
        Scanner usersScanner = new Scanner(usersFile);

        // Criamos o ArrayList de Utilizadores, vazio
        ArrayList<User> usersArray = new ArrayList<>();

        // Avançar o cabeçalho
        usersScanner.nextLine();

        // Ciclo que vai correr para cada linha do ficheiro
        while (usersScanner.hasNextLine()) {

            // Apanhamos a linha
            String linha = usersScanner.nextLine();

            // Separamos a linha, com base no seu separador ";"
            String[] linhaSeparada = linha.split(",");


            // Reunir todas as informações do user
            String username = linhaSeparada[0];
            String password= linhaSeparada[1];
            String tipo_acesso= linhaSeparada[2];

            // Criar novo Utilizador
            User newUser = new User(username, password, tipo_acesso);

            // Adicionamos ao Array
            usersArray.add(newUser);

        }

        // Terminando o ciclo (não há mais linhas)
        return usersArray;
    }

    public ArrayList<Experiencia> experienciaFileReader(String filePath) throws FileNotFoundException {

        // Abrimos o ficheiro e criamos um Scanner associado
        File experienciaFile = new File(filePath);

        Scanner experienciaScanner = new Scanner(experienciaFile);

        // Criamos o ArrayList de exeriencias, vazio
        ArrayList<Experiencia> expArray = new ArrayList<>();

        // Avançar o cabeçalho
        experienciaScanner.nextLine();

        // Ciclo que vai correr para cada linha do ficheiro
        while (experienciaScanner.hasNextLine()) {

            // Apanhamos a linha
            String linha = experienciaScanner.nextLine();

            // Separamos a linha, com base no seu separador ","
            String[] linhaSeparada = linha.split(",");

            // experiencias: id,nome,id_guia_experiencia,preco_adulto,preco_crianca

            // Reunir todas as informações da Venda
            String idExp = linhaSeparada[0];
            String nome = linhaSeparada[1];
            String id_guia_experiencia = linhaSeparada[2];
            int preco_adulto = Integer.parseInt(linhaSeparada[3]);
            int preco_crianca = Integer.parseInt(linhaSeparada[4]);

            // Criar novo Utilizador
            Experiencia newExperiencia = new Experiencia(idExp, nome, id_guia_experiencia, preco_adulto, preco_crianca);

            // Adicionamos ao Array
            expArray.add(newExperiencia);

        }

        // Terminando o ciclo (não há mais linhas)
        return expArray;
    }

    public ArrayList<Ratings> ratingsFileReader(String filePath) throws FileNotFoundException {

        // Abrimos o ficheiro e criamos um Scanner associado
        File ratingsFile = new File(filePath);
        Scanner ratingsScanner = new Scanner(ratingsFile);

        // Criamos o ArrayList de ratings, vazio
        ArrayList<Ratings> ratingsArray = new ArrayList<>();

        // Avançar o cabeçalho
        ratingsScanner.nextLine();

        // Ciclo que vai correr para cada linha do ficheiro
        while (ratingsScanner.hasNextLine()) {

            // Apanhamos a linha
            String linha = ratingsScanner.nextLine();

            // Separamos a linha, com base no seu separador ","
            String[] linhaSeparada = linha.split(",");

            // Reunir todas as informações de ratings

            String idRatings = linhaSeparada[0];
            String idExp = linhaSeparada[1];
            int ratingExp = Integer.parseInt(linhaSeparada[2]);
            int ratingGuia = Integer.parseInt(linhaSeparada[3]);

            // Criar novo rating
            Ratings newRating = new Ratings(idRatings, idExp, ratingExp, ratingGuia);

            // Adicionamos ao Array
            ratingsArray.add(newRating);
        }

        // Terminando o ciclo (não há mais linhas)
        return ratingsArray;
    }
}
