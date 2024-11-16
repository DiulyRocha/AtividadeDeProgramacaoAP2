# PROGRAMAÇÃO ORIENTADA A OBJETOS

# Segunda Atividade Prática - Avaliativa - AP2

**ATIVIDADE AVALIATIVA:**

Você foi contratado para desenvolver um sistema simples de gerenciamento de veículos. O sistema deve utilizar conceitos de orientação a objetos, com foco em métodos de acesso, herança e classes abstratas.

**REQUISITOS:**


Crie uma classe abstrata chamada Veiculo, que deve conter os seguintes atributos:

- marca (público)
- modelo (público)
- ano (privado)

Crie os seguintes métodos na classe Veiculo:

- Um método abstrato informacoesVeiculo() que retornará informações sobre o veículo.
- Métodos getAno() e setAno(int ano) para acessar e modificar o atributo ano.
  
Crie duas classes que herdam de Veiculo:

- Carro: com o atributo adicional numeroPortas (público).
- Moto: com o atributo adicional cilindrada (privado).
- Implemente o método abstrato informacoesVeiculo() nas classes Carro e Moto, para que ele retorne uma string com todas as informações do veículo (marca, modelo, ano, e atributos adicionais).

Crie uma classe Main que deverá instanciar um objeto de cada classe (Carro e Moto), definir os valores dos atributos e imprimir as informações dos veículos utilizando o método informacoesVeiculo().



**ISTRUÇÕES DE ENTREGA**

Passos para Submissão:

- Crie um Repositório no GitHub específico para estas tarefas de programação. Nomeie o repositório de forma apropriada.
- Adicione os Arquivos de Código correspondentes a cada tarefa. Certifique-se de que os arquivos estejam bem comentados e formatados.
- Documente seu Trabalho incluindo um arquivo README.md no repositório, descrevendo cada tarefa e fornecendo instruções de execução.
- Faça o Commit e Push das alterações com descrições claras e descritivas.
- Submeta o Link do Seu Repositório.

**CRITÉRIOS DE AVALIAÇÃO**

- Correção do código em relação aos requisitos de cada tarefa.
- Organização e clareza do código.
- Adequação do uso do GitHub, incluindo a qualidade dos commits e a presença de um README.md apropriado.




# DESCRIÇÃO DO PROJETO: SISTEMA DE GERENCIAMENTO DE VEÍCULOS

Este é um sistema simples de gerenciamento de veículos, desenvolvido em **Java**, com o objetivo de demosntrar os conceitos fundamentais de 
programação orientada a objetos (POO), como **herança**, **abstração** e **encapsulamento**.
O sistema permite cadastrar informações de veículos do tipo **Carro** e **Moto**, e exibir seus detalhes em um formato organizado. 


**ESTRUTURA DO PROJETO** 

O projeto é composto pelas seguintes classes: 

1. Classe Abstrata: **Veículo**
Essa classe serve como base para as classes específicas Carro e Moto.
Ela define os atributos e métodos genéricos que serão compartilhados pelas classes derivadas.

Atributos: 

- **marca (público):** Define a marca do veículo.
- **modelo (público):** Define o modelo do veículo.
- **ano (privado):** Define o ano de fabricação do veículo.

Métodos:

- **getAno():** Retorna o valor do atributo privado ano.
- **setAno(int ano):** Define o valor do atributo privado ano.
- **informacoesVeiculo():** Método abstrato que deve ser implementado pelas classes 
derivadas para retornar as informações completas do veículo.

2. Classe: **Carro**
   Representa um veículo do tipo carro. Esta classe herda de Veiculo.

Atributos: 

- **numeroPortas (público):** Define o número de portas do carro.

Métodos:

- **informacoesVeiculo():** Implementa o método abstrato da classe Veiculo, retornando as informações completas do carro.


3. Classe: **Moto**
Representa um veículo do tipo moto. Esta classe também herda de Veiculo.

Atributos: 

- **cilindrada (privado):** Define a cilindrada da moto (potência do motor).
  

Métodos:

- **getCilindrada():** Retorna o valor do atributo privado cilindrada.
- **setCilindrada(int cilindrada):** Define o valor do atributo privado cilindrada.
- **informacoesVeiculo():** Implementa o método abstrato da classe Veiculo, retornando as informações completas da moto.

4. Classe: **Main**
Classe principal do sistema. É responsável por instanciar objetos de Carro e Moto, definir seus atributos e exibir as informações 
usando o método **informacoesVeiculo()**.

FUNCIONALIDADES

- Cadastro de veículos do tipo Carro e Moto.
- Exibição das informações detalhadas dos veículos no console

COMO O CÓGIDO FUNCIONA?

1. Instanciação dos Objetos:  

Na classe Main, criamos objetos para cada tipo de veículo (Carro e Moto).
2. Definição dos Atributos:

Usamos os atributos públicos (marca, modelo) e os métodos de acesso (getAno() e setAno() para o ano, e getCilindrada() e setCilindrada() para a cilindrada da moto).

3. Exibição das Informações:

O método informacoesVeiculo() é chamado para imprimir todas as informações sobre os veículos. Cada classe (Carro e Moto) implementa esse método de forma personalizada.


Exemplo de saída do programa: 

Carro: Marca = Toyota, Modelo = Corolla, Ano = 2022, Número de Portas = 4

Moto: Marca = Honda, Modelo = CB500, Ano = 2021, Cilindrada = 500




















