#  PetMatch
## Sistema de Cadastro e Adoção de Pets

>Integrantes
> - Adriano Ferreira da Silva - RA: 12522195661
> - Giovanna Silva Ribeiro - RA: 12522171687
> - Samile Soares Pereira - RA: 125221100603 

A PETMATCH é uma plataforma inovadora criada para conectar pessoas apaixonadas por animais a pets disponíveis para adoção, tornando o processo mais ágil, prático e personalizado. Com um sistema intuitivo, facilitamos a busca e o cadastro de pets, permitindo que adotantes encontrem animais compatíveis com suas preferências. Nosso foco é promover adoções conscientes e impactar positivamente a sociedade, apoiando ONGs e cuidadores a encontrar lares cheios de amor e cuidado para os pets.

O projeto visa criar uma plataforma que estreita a relação entre ONGs e adotantes, permitindo que ONGs cadastrem pets com informações detalhadas e fotos, enquanto os adotantes possam filtrar e visualizar os animais, enviando solicitações de adoção. O sistema também gerencia o status dos pets e registra todas as adoções realizadas, garantindo uma experiência eficiente e transparente para todos os envolvidos.

A PETMATCH é uma plataforma desenvolvida com um conjunto robusto de tecnologias, oferecendo uma experiência moderna e eficiente para os usuários. A integração entre o banco de dados, o front-end e as estruturas de dados é cuidadosamente planejada para garantir desempenho, usabilidade e funcionalidade.

## Banco de Dados e Conexão com o Backend
No backend, utilizamos o MySQL como banco de dados relacional para armazenar informações críticas sobre usuários, pets e adoções. A conexão entre o banco e o backend em Java é feita por meio do JDBC (Java Database Connectivity), que permite a execução de comandos SQL para operações como INSERT, SELECT, UPDATE e DELETE.

A DatabaseConnection centraliza a configuração da conexão com o banco de dados, fornecendo uma maneira eficiente e reutilizável de estabelecer essa comunicação. Já as classes DAO (Data Access Object), como UsuarioDAO, PetDAO e AdocaoDAO, são responsáveis por realizar operações CRUD e consultas específicas, garantindo que os dados sejam manipulados de maneira segura e eficiente. O banco de dados relacional organiza as tabelas para representar as entidades do sistema, como Usuarios, Pets e Adocoes, permitindo um armazenamento estruturado e de fácil acesso.

## Front-End
O front-end da plataforma é desenvolvido utilizando HTML5 e CSS3 para a estrutura e o estilo das páginas. A biblioteca Bootstrap 5 é empregada para garantir um design responsivo e o uso de componentes modernos, como botões, formulários e modais. A tipografia é enriquecida com fontes do Google Fonts, enquanto os ícones são fornecidos pelo Bootstrap Icons, criando uma interface limpa e intuitiva. A interatividade é possibilitada por scripts em JavaScript nativo, que são usados para filtros dinâmicos, eventos de interação e manipulação do DOM, proporcionando uma navegação fluida e interativa. O layout é otimizado para diferentes dispositivos, garantindo que a experiência do usuário seja consistente em desktop, tablet e mobile.

### Design do Front-End
O design do site é moderno e acolhedor, com uma paleta de cores que mistura tons de roxo e verde, criando um visual agradável e harmônico. A fonte Poppins foi escolhida pela sua legibilidade, enquanto bordas arredondadas e sombras suaves ajudam a criar um ambiente visualmente agradável e relaxante. O layout responsivo é organizado em grades, garantindo que todos os elementos estejam alinhados e acessíveis. Os botões interativos e a navegação intuitiva tornam a experiência do usuário simples e eficiente. Gradientes e imagens bem alinhadas ajudam a destacar elementos-chave da plataforma, oferecendo uma interface agradável e funcional.

## Estruturas de Dados (Java)
O sistema também faz uso de estruturas de dados eficientes para garantir o bom funcionamento das funcionalidades.

Lista Duplamente Ligada: Utilizada para listar os pets disponíveis para adoção. Esta estrutura permite adicionar e remover informações sobre os animais de forma flexível e eficiente, tanto no início, meio quanto no fim da lista. Cada pet é representado com dados como nome, idade, espécie, raça, perfil e status, que são enviados para o banco de dados para armazenamento.

Fila: Implementada para gerenciar as solicitações de adoção, permitindo que as pessoas sejam processadas em ordem de chegada, separadas por ONGs e o animal desejado para adoção. A fila armazena informações como nome, email, telefone e endereço do adotante, os quais são armazenados de forma segura no banco de dados.

Essas estruturas de dados contribuem para o desempenho da plataforma, garantindo que as operações de inserção e remoção de dados sejam realizadas de maneira rápida e eficiente, enquanto mantém a organização dos dados no banco de forma clara e acessível.

## Conclusão
A PETMATCH é mais do que uma plataforma A PETMATCH é uma plataforma de adoção que une tecnologia e propósito social para transformar vidas. Utilizamos listas para organizar usuários e pets, e filas para gerenciar solicitações de adoção com agilidade.

Os dados são armazenados em um banco relacional robusto, garantindo organização e confiabilidade no processo. Assim, promovemos conexões reais entre pets e pessoas, criando mais lares felizes e menos abandono. 
