package com.rgos_developer.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {
        String[] frases = {
                "A persistência é o caminho do êxito.",
                "No meio da dificuldade encontra-se a oportunidade.",
                "A vida é 10% do que acontece a você e 90% de como você reage a isso.",
                "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
                "Acredite que você pode, assim você já está no meio do caminho.",
                "O único lugar onde o sucesso vem antes do trabalho é no dicionário.",
                "Acredite em milagres, mas não dependa deles.",
                "Faça de cada limitação uma oportunidade.",
                "Você nunca será velho demais para estabelecer um novo objetivo ou sonhar um novo sonho.",
                "Acredite em si próprio e todo o resto será mais fácil.",
                "O fracasso é apenas a oportunidade de começar de novo, desta vez de forma mais inteligente.",
                "O futuro pertence àqueles que acreditam na beleza dos seus sonhos.",
                "A melhor maneira de prever o futuro é criá-lo.",
                "O sucesso não é o final, o fracasso não é fatal: é a coragem de continuar que conta.",
                "A única maneira de fazer um excelente trabalho é amar o que você faz.",
                "Grandes coisas nunca vêm de zonas de conforto.",
                "Acredite que você pode e você já está no meio do caminho.",
                "A vida é sobre criar impacto, não uma renda.",
                "Seu tempo é limitado, então não o gaste vivendo a vida de outra pessoa.",
                "Não espere. O tempo nunca será justo.",
                "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
                "Não deixe o que você não pode fazer interferir com o que você pode fazer.",
                "Acredite em si mesmo e em tudo o que você é. Saiba que há algo dentro de você que é maior do que qualquer obstáculo.",
                "A única maneira de alcançar o impossível é acreditar que é possível.",
                "A diferença entre o impossível e o possível está na determinação da pessoa.",
                "O segredo do sucesso é começar.",
                "Acredite que você pode e já está no meio do caminho.",
                "O sucesso é ir de fracasso em fracasso sem perder o entusiasmo.",
                "O caminho para o sucesso e o caminho para o fracasso são quase exatamente os mesmos.",
                "Você nunca sabe que resultados virão da sua ação. Mas se você não fizer nada, não haverá resultados.",
                "Para ter sucesso, primeiro precisamos acreditar que podemos.",
                "O sucesso é a soma de pequenos esforços, repetidos dia após dia.",
                "Acredite em si mesmo e todo o resto se encaixará. Tenha fé em suas próprias habilidades, trabalho duro e não haverá nada que você não possa alcançar.",
                "O sucesso não é a chave para a felicidade. A felicidade é a chave para o sucesso. Se você ama o que está fazendo, será bem-sucedido.",
                "Não tenha medo de desistir do bom para ir para o ótimo.",
                "O sucesso não é final, o fracasso não é fatal: é a coragem de continuar que conta.",
                "Não pare quando estiver cansado. Pare quando estiver terminado.",
                "Acredite em milagres, mas não dependa deles.",
                "Faça de cada limitação uma oportunidade.",
                "Você nunca será velho demais para estabelecer um novo objetivo ou sonhar um novo sonho.",
                "O fracasso é apenas a oportunidade de começar de novo, desta vez de forma mais inteligente.",
                "A melhor maneira de prever o futuro é criá-lo.",
                "O sucesso não é final, o fracasso não é fatal: é a coragem de continuar que conta.",
                "A única maneira de fazer um excelente trabalho é amar o que você faz.",
                "Grandes coisas nunca vêm de zonas de conforto.",
                "A vida é sobre criar impacto, não uma renda.",
                "Seu tempo é limitado, então não o gaste vivendo a vida de outra pessoa.",
                "Não espere. O tempo nunca será justo.",
                "Não deixe o que você não pode fazer interferir com o que você pode fazer."
        };
        int indexAleatorio = new Random().nextInt(frases.length);
        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[indexAleatorio]);
    }
}