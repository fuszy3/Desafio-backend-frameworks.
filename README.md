# Desafio-backend-frameworks.
 Evidenciar o conhecimento prático sobre a Arquitetura em Camadas e a Classificação por Linguagem através do "Bootstrap".

# Comparação entre Frameworks: Uma análise comparativa entre o Node.js/Express e o Java/Spring Boot
Node.js/Express é focado em **agilidade e alta performance** para conexões simultâneas. Por ser simples, oferece grande Liberdade na organização das pastas e é ideal para APIs rápidas e escaláveis. Já o Java/Spring Boot é **uma solução robusta e padronizada**. Excelente para sistemas corporativos complexos que exigem uma segurança rígida e processamento pesado, mas possui uma configuração inicial mais lenta comparada ao Node.js/express.

**Em resumo:**
* Node.js/Express: Mais ágil, menos burocrático e ideal para entregas rápidas.
* Java/Spring Boot: Focado em padronização, segurança e sistemas de grande porte.

# Explicação das Pastas/camadas:

# Node_modules
Esta pasta contém todas as bibliotecas e depedências externas instaladas via NPM. Ela é o "motor" que permite usar o express e outros pacotes.

# Pacote de Controles
É a camada de entrada da aplicação. O **controller** é responsável por:
* Receber as requisições **HTTP** (GET, POST, etc.);
* Validar dados de entrada;
* Chamar a camada de serviço necessária;
* Retornar a resposta (**JSON**, status code) para o cliente.

# Pacote-Service
Aqui reside a Regra de Negócio. É o cerebro da aplicação. Em vez de colocar cálculos ou lógicas complexas no controller, você as coloca aqui. Isso permite que a mesma lógica seja reutilizada em diferentes partes do sistema, mantendo o código limpo e fácil de testar. 

# Pacote Models 
Esta camada representa a estrutura dos dados e a comunicação com o banco de dados. Ela define como os objetos (ex: Usuário, Produto) se parecem. 

# Fluxo 
O ciclo de uma requisição segue o modelo de camadas, garantindo que os dados sejam processados e validados antes de retornarem ao usuário:
* Entrada (Pedido do cliente)
Controles --> Service --> Models
* Saida (Resposta do Cliente) 
Models --> Service --> Controles