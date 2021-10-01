Exercício Herança
Crie a classe Consulta com os seguintes atributos privados:
- Nome do paciente
- Matrícula (5 dígitos alfanuméricos)
- Número de dependentes
- Ano de inclusão no plano
- Valor da consulta
Crie métodos get e set para cada atributo.
Crie as subclasses (extends):
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