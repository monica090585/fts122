Feature: Pesquisa do Google
	Scenario: Com Sucesso
		Given que acesso o Google
		When digito "chocolate" e aperto Enter
		Then exibe uma pagina com links e o titulo "chocolate - Pesquisa Google"