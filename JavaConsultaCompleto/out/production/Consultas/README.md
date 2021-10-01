# JavaConsultaCompleto
Exercício Herança
Crie o pacote br.edu.unifil.lpoo.consulta.modelo e crie a classe Consulta com os seguintes atributos
privados:
- Nome do paciente
- Matrícula (5 dígitos alfanuméricos)
Atributos protegidos (protected):
- Número de dependentes
- Ano de inclusão no plano
- Valor da consulta
Crie métodos get e set para cada atributo.
No pacote br.edu.unifil.lpoo.consulta.modelo crie as subclasses (extends):
- ConsultaPrata
- ConsultaOuro
- ConsultaDiamante
- ConsultaFamilia
Em cada subclasse sobrescreva o método getValorConsulta() conforme a tabela de descontos
abaixo.
A tabela de descontos, que depende do tipo de plano, é fornecida abaixo:
Tipo das Consultas:
ConsultasPrata – desconto de 20% no valor da consulta.
ConsultasDiamante – desconto de 40 % no valor da consulta.
ConsultasOuro – desconto de 30 %, se o ano for <= a 2000 a consulta sai de graça.
ConsultasFamilia – desconto de 50% se o número de dependentes for >2.
No pacote br.edu.unifil.lpoo.consulta.controle, crie a classe CadastroDeConsultas com o atributo
ArrayList listaConsultas e os métodos:
- Incluir uma nova Consulta no cadastro(ArrayList);
- Exibir matrícula e nome dos pacientes de todas as Consultas específico de plano de saúde:
Prata, Ouro, Diamante e Família.
- Retornar o número total de Consultas de um tipo específico de plano de saúde: Prata, Ouro,
Diamante e Família.
- Retornar o valor total de Consultas de um tipo específico de plano de saúde: Prata, Ouro,
Diamante e Família.
No pacote br.edu.unifil.lpoo.consulta.visao, crie a classe SistemaDaClinica com o método main
onde deve ser instanciado o CadastroDeConsulta e devem ser solicitadas as informações para o
agendamento de uma nova consulta. A nova consulta deve ser criada se informado os dados
necessários do paciente, e em seguida incluída no cadastro. O menu também deve ter opções para a
consultar as consultas cadastradas por plano, consultar o total de consultas por plano, consultar o
valor total de consultas por plano e uma opção fim.

Deve-se construir essa aplicação utilizando os conceitos de OO, herança. A parte de interação com o
usuário deve ser feita utilizando-se a classe Scanner.