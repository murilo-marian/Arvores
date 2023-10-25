import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        long inicio; // inicio da conta de tempo
        long fim; // fim da conta de tempo
        long tempoDecorrido = 0; //fim - inicio


        int[] vetor = Util.geraArray(100_000);
        System.out.println("Array criado");

        int[] vetorAleatorizado = Util.aleatorizaArray(vetor.clone());
        System.out.println("Array aleatorizado");

        int[] vetorMilhao = Util.geraArray(1_000_000);
        System.out.println("Array criado");

        int[] vetorAleatorizadoMilhao = Util.aleatorizaArray(vetorMilhao.clone());
        System.out.println("Array aleatorizado");







        System.out.println("inserção");
        System.out.println("Cem mil");
        System.out.println("Organizado");
        System.out.println("--------------");


       /* System.out.println("Arvore Binaria");

        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        inicio = System.nanoTime();
        for (int i : vetor) {
            arvoreBinaria.inserirSemRecursividade(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
*/

        System.out.println("--------------");
        System.out.println("Arvore AVL");
        inicio = System.nanoTime();
        ArvoreAVL arvoreAVL = new ArvoreAVL();
        for (int i : vetor) {
            arvoreAVL.inserir(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;
        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");

        System.out.println("--------------");


        System.out.println("Arvore B (ordem 4)");
        inicio = System.nanoTime();
        BTree bTree4 = new BTree(4);
        for (int i : vetor) {
            bTree4.insert(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");


        System.out.println("--------------");
        System.out.println("Arvore B (ordem 6)");
        inicio = System.nanoTime();
        BTree bTree6 = new BTree(4);
        for (int i : vetor) {
            bTree6.insert(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");

        System.out.println("--------------");





        //---------------------------------
        System.out.println("VETOR ALEATORIO");
       /* System.out.println("Arvore Binaria");
        ArvoreBinaria arvoreBinariaA = new ArvoreBinaria();

        inicio = System.nanoTime();
        for (int i : vetorAleatorizado) {
            arvoreBinariaA.inserirSemRecursividade(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
*/
        System.out.println("--------------");
        System.out.println("Arvore AVL");
        inicio = System.nanoTime();
        ArvoreAVL arvoreAVLA = new ArvoreAVL();
        for (int i : vetorAleatorizado) {
            arvoreAVLA.inserir(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");

        System.out.println("--------------");

        System.out.println("Arvore B (ordem 4)");
        inicio = System.nanoTime();
        BTree bTree4A = new BTree(4);
        for (int i : vetorAleatorizado) {
            bTree4A.insert(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");


        System.out.println("--------------");
        System.out.println("Arvore B (ordem 6)");
        inicio = System.nanoTime();
        BTree bTree6A = new BTree(4);
        for (int i : vetorAleatorizado) {
            bTree6A.insert(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");




        System.out.println("Vetor milhão");
/*

        System.out.println("Arvore Binaria");
        ArvoreBinaria arvoreBinariaM = new ArvoreBinaria();
        inicio = System.nanoTime();
        for (int i : vetorMilhao) {
            arvoreBinariaM.inserirSemRecursividade(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
*/

        System.out.println("--------------");
        System.out.println("Arvore AVL");
        inicio = System.nanoTime();
        ArvoreAVL arvoreAVLM = new ArvoreAVL();
        for (int i : vetorMilhao) {
            arvoreAVLM.inserir(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");

        System.out.println("--------------");

        System.out.println("Arvore B (ordem 4)");
        inicio = System.nanoTime();
        BTree bTree4M = new BTree(4);
        for (int i : vetorMilhao) {
            bTree4M.insert(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");


        System.out.println("--------------");
        System.out.println("Arvore B (ordem 6)");
        inicio = System.nanoTime();
        BTree bTree6M = new BTree(4);
        for (int i : vetorMilhao) {
            bTree6M.insert(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");

        System.out.println("--------------");



        System.out.println("VETOR ALEATORIO");
       /* System.out.println("Arvore Binaria");
        ArvoreBinaria arvoreBinariaAM = new ArvoreBinaria();

        inicio = System.nanoTime();
        for (int i : vetorAleatorizadoMilhao) {
            arvoreBinariaAM.inserirSemRecursividade(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
*/
        System.out.println("--------------");
        System.out.println("Arvore AVL");
        inicio = System.nanoTime();
        ArvoreAVL arvoreAVLAM = new ArvoreAVL();
        for (int i : vetorAleatorizadoMilhao) {
            arvoreAVLAM.inserir(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");

        System.out.println("--------------");

        System.out.println("Arvore B (ordem 4)");
        inicio = System.nanoTime();
        BTree bTree4AM = new BTree(4);
        for (int i : vetorAleatorizadoMilhao) {
            bTree4AM.insert(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");


        System.out.println("--------------");
        System.out.println("Arvore B (ordem 6)");
        inicio = System.nanoTime();
        BTree bTree6AM = new BTree(4);
        for (int i : vetorAleatorizadoMilhao) {
            bTree6AM.insert(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");
















        System.out.println("PESQUISA");
        System.out.println("Cem mil");
        System.out.println("Organizado");
        System.out.println("--------------");
       /* System.out.println("Arvore Binaria");

        inicio = System.nanoTime();
        arvoreBinaria.pesquisar(100_000);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");
*/

        System.out.println("ARVORE AVL");
        inicio = System.nanoTime();
        arvoreAVL.pesquisar(100_000);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");

        System.out.println("ARVORE B (ordem 4)");
        inicio = System.nanoTime();
        bTree4.findValue(100_000);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");

        System.out.println("ARVORE B (ordem 6)");
        inicio = System.nanoTime();
        bTree6.findValue(100_000);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");

        System.out.println("ALEATORIO");
/*

        System.out.println("Arvore Binaria");
        inicio = System.nanoTime();
        arvoreBinariaA.pesquisar(100_000);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;
*/

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");


        System.out.println("ARVORE AVL");
        inicio = System.nanoTime();
        arvoreAVLA.pesquisar(100_000);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");

        System.out.println("ARVORE B (ordem 4)");
        inicio = System.nanoTime();
        bTree4A.findValue(100_000);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");

        System.out.println("ARVORE B (ordem 6)");
        inicio = System.nanoTime();
        bTree6A.findValue(100_000);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");




        System.out.println("UM MILHÃO");
        System.out.println("Organizado");
        System.out.println("--------------");
        System.out.println("Arvore Binaria");
/*

        inicio = System.nanoTime();
        arvoreBinariaM.pesquisar(1_000_000);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");

*/

        System.out.println("ARVORE AVL");
        inicio = System.nanoTime();
        arvoreAVLM.pesquisar(1_000_000);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");

        System.out.println("ARVORE B (ordem 4)");
        inicio = System.nanoTime();
        bTree4M.findValue(1_000_000);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");

        System.out.println("ARVORE B (ordem 6)");
        inicio = System.nanoTime();
        bTree6M.findValue(1_000_000);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");




        System.out.println("ALEATORIO");
/*

        System.out.println("Binaria");
        inicio = System.nanoTime();
        arvoreBinariaAM.pesquisar(1_000_000);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");
*/


        System.out.println("ARVORE AVL");
        inicio = System.nanoTime();
        arvoreAVLAM.pesquisar(1_000_000);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");

        System.out.println("ARVORE B (ordem 4)");
        inicio = System.nanoTime();
        bTree4AM.findValue(1_000_000);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");

        System.out.println("ARVORE B (ordem 6)");
        inicio = System.nanoTime();
        bTree6AM.findValue(1_000_000);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");












        System.out.println("EXCLUSÃO");
        System.out.println("ORDENADO");
        System.out.println("--------------");
      /*  System.out.println("Arvore Binaria");

        inicio = System.nanoTime();
        for (int i : vetor) { //exclui em ordem
            arvoreBinaria.removerImperativo(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        */System.out.println("--------------");

        System.out.println("ARVORE AVL");
        inicio = System.nanoTime();
        for (int i : vetor) { //exclui em ordem
            arvoreAVL.remover(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");

        /*System.out.println("ARVORE B (ORDEM 4)");

        inicio = System.nanoTime();
        for (int i : vetor) { //exclui em ordem
            bTree4.delete(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");

        System.out.println("ARVORE B (ORDEM 6)");

        inicio = System.nanoTime();
        for (int i : vetor) { //exclui em ordem
            bTree6.delete(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");*/
        System.out.println("--------------");





        System.out.println("ALEATORIO");
        System.out.println("--------------");
        System.out.println("Arvore Binaria");

        int[] vetorExclusao = Util.aleatorizaArray(vetor.clone());
        int[] vetorExclusaoM = Util.aleatorizaArray(vetorMilhao.clone());
        /*System.out.println("Array criado");
        inicio = System.nanoTime();
        for (int i : vetorExclusao) { //exclui em ordem
            arvoreBinariaA.removerImperativo(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        */System.out.println("--------------");

        System.out.println("ARVORE AVL");
        inicio = System.nanoTime();
        for (int i : vetorExclusao) { //exclui em ordem
            arvoreAVLA.remover(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");
/*
        System.out.println("ARVORE B (ORDEM 4)");

        inicio = System.nanoTime();
        for (int i : vetorExclusao) { //exclui em ordem
            bTree4A.delete(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");

        System.out.println("ARVORE B (ORDEM 6)");

        inicio = System.nanoTime();
        for (int i : vetorExclusao) { //exclui em ordem
            bTree6A.delete(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");*/
        System.out.println("--------------");







        System.out.println("MILHÃO");
        System.out.println("ORDENADO");
        System.out.println("--------------");
       /* System.out.println("Arvore Binaria");

        inicio = System.nanoTime();
        for (int i : vetorMilhao) { //exclui em ordem
            arvoreBinariaM.removerImperativo(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        */System.out.println("--------------");

        System.out.println("ARVORE AVL");
        inicio = System.nanoTime();
        for (int i : vetorMilhao) { //exclui em ordem
            arvoreAVLM.remover(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");
/*
        System.out.println("ARVORE B (ORDEM 4)");

        inicio = System.nanoTime();
        for (int i : vetorMilhao) { //exclui em ordem
            bTree4.delete(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");

        System.out.println("ARVORE B (ORDEM 6)");

        inicio = System.nanoTime();
        for (int i : vetorMilhao) { //exclui em ordem
            bTree6.delete(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");*/
        System.out.println("--------------");








        System.out.println("ALEATORIO");
        System.out.println("--------------");
        System.out.println("Arvore Binaria");
/*

        inicio = System.nanoTime();
        for (int i : vetorExclusaoM) { //exclui em ordem
            arvoreBinariaAM.removerImperativo(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");
*/

        System.out.println("ARVORE AVL");
        inicio = System.nanoTime();
        for (int i : vetorExclusaoM) { //exclui em ordem
            arvoreAVLAM.remover(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");
/*
        System.out.println("ARVORE B (ORDEM 4)");

        inicio = System.nanoTime();
        for (int i : vetorExclusaoM) { //exclui em ordem
            bTree4AM.delete(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");

        System.out.println("ARVORE B (ORDEM 6)");

        inicio = System.nanoTime();
        for (int i : vetorExclusaoM) { //exclui em ordem
            bTree6AM.delete(i);
        }
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;

        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("--------------");*/
    }
}
