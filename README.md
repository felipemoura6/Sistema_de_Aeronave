# Sistema_de_Aeronave

## 1.Descrição
O projeto Sistema de Aeronave em Java é um sistema simples de controle de aeronaves que inclui classes para representar aviões e helicópteros. Ele oferece funcionalidades básicas como aceleração, manutenção e simulação de escolha aleatória para enviar aeronaves para manutenção.

## 2.Funcionalidades
- Aceleração:
Aviões e helicópteros podem acelerar, com a opção de avião acelerar com marcha.

- Manutenção:
Todas as aeronaves podem passar por manutenção, com uma mensagem indicando que a aeronave foi enviada para manutenção.

- Simulação de Manutenção Aleatória:
O sistema simula a escolha aleatória de uma aeronave para manutenção, evitando enviar a mesma aeronave consecutivamente.

## 3.Estrutura do Projeto

O projeto é dividido em classes que representam diferentes tipos de aeronaves. Cada classe herda da classe abstrata Aeronave que implementa a interface Aeromotor. As classes específicas (Aviao e Helicoptero) têm métodos e atributos exclusivos.

## 4.Utilização
O arquivo principal MainAeronave contém uma simulação básica onde são criadas instâncias de aviões e helicópteros, adicionadas a uma lista e, em seguida, é realizada a simulação de manutenção aleatória.

## 5.Contribuições
Sinta-se à vontade para contribuir para o projeto, abrindo problemas (issues) ou enviando pull requests.

Licença: MIT
