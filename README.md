# Java primeiros passos: Lógica de Programação
![image](https://github.com/user-attachments/assets/1d5d8910-f582-4e6f-b10b-b02ca54068bd)

Esse repositório tem o intuito de mostrar toda minha trajetória no curso "Java primeiros passos: lógica de programação e algoritmos".

---


### ☕ 1. Algoritmo

- Sequência finita de instruções para se resolver um problema.

---

### ☕ 2. Automação

- Consiste em utilizar máquina(s) para executar o procedimento
desejado de forma automática ou semiautomática.

---

### ☕ **3. Programa de Computador**

**3.1  Hardware - parte física (a máquina em si)**

**3.2 Software - parte lógica (programas)**

- Sistema operacional (Windows, Linux, iOS)
- Aplicativos (apps de escritório, app de câmera, navegador web)
- Jogos
- Utilitários (Antivírus, compactador de arquivos)
- Outros

**3.3 Programas de computador são algoritmos executados pelo computador (em linhas gerais).**

**3.4 Conclusão: o computador é uma máquina que automatiza a execução de algoritmos.**

- Processamento de dados
- Cálculos

---

### ☕ **4. O que é preciso para se fazer um programa de computador?**

**4.1 Linguagem de programação**

- Regras léxicas e sintáticas para se escrever o programa

**4.2 IDE**

- software para editar e testar o programa

**4.3 Compilador**

Gerador de código ou máquina virtual:

- Software que permite que o programa seja executado

---

### ☕ 5. Linguagem de Programação

- É um conjunto de regras léxica (ortografia) e sintáticas (gramática) para se escrever programas

**5.1 Léxica**

- Palavras “isoladas” (ortografia)

Português

Linguagem de Programação

- cachorro ✅
- caxorro

- main ✅
- maim

**5.2 Sintática**

- Sentenças (gramática)

Português

- O cachorro está com fome ✅
- A cachorro está com fome

Linguagem de Programação

- x = 2 + y; ✅
- x = + 2 y;

**5.3 Exemplos de linguagens de programação:**

- C
- Pascal
- C++
- Java ✅
- JavaScript e etc.

- C#
- Python
- Ruby
- PHP

5.4 Exemplo de programa:

<aside>
☕ Suponha um programa que solicita do usuário dois números e depois mostra a média aritmética deles:

Exemplo: 

Digite o primeiro número:
~ 3
Digite o segundo número: 
~ 6

Media = 4.5

</aside>

Solução em linguagem Java

```java
import java.util.Scanner

public class Main {
 public static void main (String[] {
 
 Scanner sc = new Scanner(System.in);
 double x, y, media;
 
 System.out.print("Digite o primeiro número: ");
 x = sc.nextDouble();
 
 System.out.print("Digite o segundo número: ");
 y = sc.nextDouble();
 
 media = (x + y) / 2.0;
 
 System.out.println("Media = " + media);
 
 sc.close();
 }
}
```

---

### ☕ 6. IDE Ambiente Integrado de Desenvolvimento

- É um conjunto de softwares utilizado para a construção de programas.

6.1 Funcionalidades de uma IDE

- Edição de código fonte (endentação, autocompletar, destaque de palavras, etc.)
- Depuração e testes
- Construção do produto final (build)
- Sugestão de modelos (templates)
- Auxiliar em várias tarefas do seu projeto
- Etc.

6.2 Exemplos:

- C/C++ : Code Blocks
- Java : Eclipse, NetBeans  ✅
- C# : Microsoft Visual Studio

---

### Anexos

[02-introducao.pdf](https://prod-files-secure.s3.us-west-2.amazonaws.com/1b28da91-f02b-407b-b2c8-6720e71da69e/64578581-ccaf-4428-bfe7-52afcbf8bf79/02-introducao.pdf)
