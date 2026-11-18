
/* Se você está vendo esta mensagem é porque fez tudo certo até aqui. 
    Boa prova! */

void main() {
    double temperaturaC;
    double i = 0;
    double soma = 0;

    temperaturaC = Double.parseDouble(IO.readln("Insira a temperatura em Celsius: "));
    soma += temperaturaC;
    i++;
    


    do {
        temperaturaC = Double.parseDouble(IO.readln("Insira a temperatura em Celsius: "));
        soma += temperaturaC;
        i++;
        
    } while(temperaturaC < 999); {
        if(temperaturaC == 999) {
            soma = soma - 999;
            i = i - 1;
        }
    };

    IO.println("--INFORMAÇÕES--");
    IO.println("Total de temperaturas inseridas: " + i);
    
    if((soma/i) < 18) {
        IO.println("Temperatura Baixa: Ligar Aquecimento.");
    } if((soma/i) > 28) {
        IO.println("Temperatura Alta: Ligar Ventilação.");
    } else {
        IO.println("Temperatura Ideal.");
    }
    IO.println();

    IO.println("Programa terminado;");
   

}
