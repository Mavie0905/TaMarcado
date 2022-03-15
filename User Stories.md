# Ta marcado

## História dos Usuários

| Código    | User Story                                                   |
| --------- | ------------------------------------------------------------ |
| **US01** | Como um professor, eu gostaria de ter acesso a edição (criar, editar e deletar) das atividades do calendário para que eu possa inserir e modificar atividades |
| **US02** | Como um professor, eu gostaria de poder ver se já existem atividades em uma determinada data para que eu possa saber se os alunos já tem algo para aquele dia |
| **US03** | Como uma aluna, eu gostaria de ver as atividades de cada matéria separadamente para poder focar melhor em matérias que preciso de mais nota |
| **US04** | Como uma aluna, eu gostaria de solicitar mais prazo para algumas atividades para o caso de não conseguir realizar alguma a tempo  |
| ~~**US05**~~| ~~Como uma aluna, eu gostaria de ser notificada quando novas atividades forem definidas para que eu possa me organizar melhor~~|
| **US06** | Como uma aluna, eu gostaria de ver todas as atividades que estão pendentes em um só lugar para não ter o trabalho de ir ver em cada matéria |
| **US07** | Como uma aluna, eu gostaria de poder marcar as atividades que eu já fiz para poder separar o que preciso fazer e o que já foi feito |
| **US08** | Como usuários gerais, nós gostaríamos de ter acesso a diferentes perfis com permissões dedicadas a cada tipo de perfil  
| **US09** | Como um professor, eu gostaria de ter a possibilidade de inserir/indicar: links, vídeos, livros em PDF e artigos através de uma aba no calendário.
| **US10** | Como um aluno (a), eu gostaria de organizar a ordem das matérias da minha forma.
| **US11** | Como um aluno (a), eu gostaria de um bloco de notas (Post it), para que eu possa fazer alguma anotação necessária e deixar salva no próprio calendário.
| ~~**US12**~~ | ~~Como um aluno (a), eu gostaria de poder compartilhar algumas atividades do calendário para outros APPs (Instagram, Whatsaap, Telegram, Drive, Word, Email).~~

>Os Us's que estão tachados (~~exemplo~~) foram descartados pro projeto




## Testes de Aceitação

| Código | Código da US | Teste de Aceitação                                           |
| ------ | ------------ | ------------------------------------------------------------ |
| TA01  | US01        | DADO que eu sou um/ professor/a cadastrado/a no calendário, eu tenho acesso ao calendário e posso modificá-lo e inserir novas atualizações. QUANDO eu efetuar as atualizações desejadas e confirmar minhas mudanças no botão “Atualizar Mudanças”, ENTÃO o software permite à efetivação das minhas atualizações como professor no sistema |
| TA02  | US02        | DADO que eu sou um/a professo/a cadastrado no calendário, eu tenho acesso à visibilidade das datas das atividades já existentes dos meus alunos, mesmo as de matérias de outros professores. QUANDO eu visualizar tais atividades em determinado/s dia/s, ENTÃO o sistema interdita a minha efetuação de adição de novas atividades ao calendário no referente dia da tentativa de aplicação |
| TA03  | US03        | DADO que eu sou um/a aluno/a cadastrado/a no calendário, eu tenho acesso a cada matéria (individualmente) e posso ver as atividades da mesma. QUANDO eu logar no sistema, o mesmo me informa através de um gráfico a minha média de notas em todas as matérias, ENTÃO o software me informa em quais matérias eu necessito de mais estudo para uma melhor nota |
| TA04    | US04          | DADO que eu sou um/a aluno/a cadastrado/a no calendário, eu tenho possibilidade à solicitação de aumento de prazo nas atividades caso eu não consiga realizá-las no tempo estabelecido. QUANDO eu solicitar aumento de prazo na determinada atividade através do botão (Aumento de Prazo) situado no sistema, ENTÃO, o sistema me envia uma mensagem de confirmação via email sobre a minha solicitação de aumento de prazo ao professor. Quando o professor prorrogar a entrega o sistema envia um email de informação sobre a prorrogação para todos os alunos cadastrados no calendário.|
| TA05    | US05          | DADO que eu sou um/a aluno/a cadastrado/a no calendário, eu sou notificada/o de novas atividades, QUANDO os professores adicionarem novas atividades ao calendário, ENTÃO, o sistema manda uma notificação via email para todos os alunos cadastrados na tabela informando a nova atividade, a determinada matéria e o prazo de envio |
| TA06    | US06          | DADO que eu sou um/a aluno/o cadastrado/a no calendário, eu posso ver em uma só aba todas as matérias pendentes em relação ao envio de atividades, QUANDO eu logar no app, ENTÃO o mesmo me informa através de uma mensagem com a cor da fonte vermelha, situada no canto superior esquerdo que eu tenho pendência no envio de atividades|
| TA07    | US07          | DADO que eu sou um/a aluno/a cadastrado/a no calendário, eu posso marcar minhas atividades já concluídas e enviadas, QUANDO eu finalizar o envio da atividade, ENTÃO o sistema me mostra a possibilidade de marcar um “concluído” - (C) depois do envio|
| TA08    | US08          | DADO que eu sou um usuário qualquer e ainda não logado no sistema e estou na página de login QUANDO eu preencher os campos de usuário e senha com as minhas credenciais corretas e clicar no botão de login ENTÃO o sistema me ”loga”, permitindo acesso ao meu perfil que já foi cadastrado pelo administrador|
| TA09    | US08          | DADO que eu sou um usuário qualquer e ainda não logado no sistema e estou na página de login QUANDO eu preencher os campos de usuário e senha com as minhas credenciais corretas e clicar no botão de login ENTÃO o sistema não me "loga", pois não possuo um perfil criado (pelos administradores)|
| TA10 | US09 | DADO que eu sou um professor/a, eu tenho a possibilidade de adicionar: links,vídeos, livros em PDF e artigos. QUANDO eu logar no calendário, uma aba no canto superior direito com o nome “Add indicação”, ENTÃO o calendário me permite adicionar qualquer arquivo e a quantidade que eu quiser.
| TA11 | US10 | DADO que sou um/a aluno/a, eu posso deixar a ordem das matérias da minha forma. QUANDO eu estiver na página principal, no centro do canto esquerdo tem uma possibilidade de “Organizar Matérias”, ENTÃO eu posso mudar as ordens da minha maneira e salvar as modificaçõe.
| TA12 | US11 | DADO que sou um/a aluno/a, eu posso fazer anotações e deixá-las salvas no próprio calendário. QUANDO eu estiver na página do calendário, no canto superior direito terá uma aba “Post it”, ENTÃO ao clicar eu posso fazer uma anotação e salvar e/ou compartilhar.
| TA13 | US12 | DADO que eu sou um/a aluno/a, eu posso compartilhar algumas coisas do calendário para outros APPs. QUANDO eu clicar com o botão esquerdo em cima do que eu quiser compartilhar, ENTÃO o calendário me dá a possibilidade de enviar o que foi selecionado para alguns aplicativos (Instagram, Whatsapp, Telegram, Drive, Word, Email).
