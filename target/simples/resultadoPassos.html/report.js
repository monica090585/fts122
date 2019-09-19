$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Pesquisa.feature");
formatter.feature({
  "line": 1,
  "name": "Pesquisa do Google",
  "description": "",
  "id": "pesquisa-do-google",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5779496138,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Com Sucesso",
  "description": "",
  "id": "pesquisa-do-google;com-sucesso",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "que acesso o Google",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "digito \"chocolate\" e aperto Enter",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "exibe uma pagina com links e o titulo \"chocolate - Pesquisa Google\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Pesquisa.que_acesso_o_Google()"
});
formatter.result({
  "duration": 12805417091,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "chocolate",
      "offset": 8
    }
  ],
  "location": "Pesquisa.digito_e_aperto_Enter(String)"
});
formatter.result({
  "duration": 11577306551,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "chocolate - Pesquisa Google",
      "offset": 39
    }
  ],
  "location": "Pesquisa.exibe_uma_pagina_com_links_e_o_titulo(String)"
});
formatter.result({
  "duration": 15485344,
  "status": "passed"
});
formatter.after({
  "duration": 1635364831,
  "status": "passed"
});
});