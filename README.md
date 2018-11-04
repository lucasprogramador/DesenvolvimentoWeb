

#       Lista de Exercícios 01
        Crie uma página HTML que use o texto do seguinte documento. 
            a) A página HTML criada deve conter pelo menos 5 elementos em bloco e 5 elementos em linha.
            b) A página HTML deve conter pelo menos uma imagem relacionada ao seu conteúdo.
        Crie uma página HTML que contenha uma tabela com os índices de inflação usados no Brasil. 
            Obs: Tais índices atualizados podem ser consultados em: https://economia.uol.com.br/cotacoes/
        Crie uma página HTML com um formulário para cadastro de dados pessoais como: 
        [CPF, Nome, Telefone, Email e Data de Nascimento]


#       Lista de Exercícios 02 
        Use CSS para estilizar as páginas criadas por você na Lista de Exercícios 01.
            a) Crie um único arquivo CSS externo a ser usado e compartilhado pelas 3 páginas criadas da Lista 01.
            b) Todas as páginas devem ter um cabeçalho, um container geral com seu conteúdo e um rodapé.
        Use os conteúdos do arquivo caelum-arquivos-curso-web.zip para criar uma página HTML semelhante à página home sugerida na            apostila WD-43 da Caelum      
            Use HTML5 e CCS3.
            OBS: A apostila WD-43 da Caelum mostra o passo a passo de como construir tal página.
            
#       Lista de Exercícios 03 
        Faça o exercício proposto nos slides da disciplina sobre Bootstrap (32 passos).
            Em caso de dúvida, siga os detalhes mencionados na apostila WD-43 da Caelum.
        Crie uma página de notícias usando o Bootstrap.
            As notícias devem ser apresentadas em 3 colunas no desktop e em somente 1 coluna no celular.
            Use textos e imagens reais de algum site de notícias já existente.
            Use o componente Carousel para mostrar as notícias em destaque no topo da página.
            Use conteúdos personalizados em thumbnails (miniaturas de imagens).
        Use o Bootstrap para melhorar o visual das questões 2 (tabela com os índices de inflação usados no Brasil) e 3 (formulário para cadastro de dados pessoais) da Lista de Exercícios 01.
            As tabela e o formulário devem aparecer em abas diferentes de uma única página HTML. 
                Ou seja: as questões 2 e 3 da Lista 01 vão ficar integradas em uma única página HTML.
            A tabela deve destacar a linha sobre a qual o ponteiro do mouse passa por cima.
            O formulário deve aparecer em uma modal, após o clique de um botão para que ele apareça.
            
#       Lista de Exercícios 04  
        OBS: Esta lista exercita a autonomia do aluno para entender e usar o jQuery em algumas questões, mesmo que o jQuery ainda não tenha sido apresentado em detalhe durante as aulas.
        
        Em todas as questões defina eventos usando Javascript e não diretamente no código HTML.
        
        Crie uma página HTML com um formulário para obter preço e quantidade. Exibir em um elemento input, desabilitado para edição, o valor total (preço x quantidade) dinamicamente quando preço ou quantidade forem alterados. Usar JavaScript puro (sem jQuery).
        Crie a mesma funcionalidade da Questão 1 em uma nova página HTML, através da substituição do elemento <input> por um elemento <output>. 
            Veja um exemplo de uso do elemento <output> neste link. Use o evento oninput, mas não diretamente no HTML como no exemplo.  
        Crie uma página HTML para calcular e exibir na tela: (1) o valor do Índice de Massa Corporal (IMC) e (2) sua classificação, fazendo uso de entrada de dados (massa e altura de uma pessoa) em formulário HTML e cálculo dinâmico do resultado do IMC via JavaScript puro (sem jQuery).
        Crie a mesma funcionalidade da Questão 4 em uma nova página HTML, usando o jQuery.
        Crie uma página HTML que possui um caractere texto que segue o movimento do ponteiro do mouse pela tela. Usar JavaScript puro (sem jQuery).
            Dica: altere a posição (x, y) do caractere texto de acordo com a mudança da posição (x, y) do ponteiro do mouse na tela.
        Crie a mesma funcionalidade da Questão 6 em uma nova página HTML, usando o jQuery.
        Crie uma página HTML de notícias com poucas notícias (no minimo 3 notícias) e um botão "Mais notícias", que ao ser clicado exibe mais notícias, que não eram visualizadas antes. Usar o jQuery.

#           Lista de Exercícios 05 

        OBS: Todas as questões desta lista devem ser resolvidas em uma única aplicação Web. Desse modo, você deve enviar um único arquivo WAR contendo toda a aplicação com as resoluções de todas as questões da lista e também com o código fonte.  A geração do arquivo WAR pode ser realizada através da opção de Exportação do Eclipse.

        Crie uma única aplicação Web com as funcionalidades abaixo. A página principal da aplicação deverá conter um menu com links para as demais funcionalidades. Os resultados das submissões de formulários devem ocorrer através de Servlets. Crie quantos Servlets você julgar necessário para resolver os itens abaixo.

            Em uma página HTML, calcular e exibir na tela: (1) o valor do Índice de Massa Corporal (IMC) e (2) sua classificação, fazendo uso de entrada de dados (massa e altura de uma pessoa) em formulário HTML e cálculo do resultado do IMC via Servlet (sem Javascript). A submissão do formulário leva a apresentação do resultado em uma nova página gerada pelo Servlet.
            Obter dois números em um formulário Web e após a submissão deste formulário, exibir a soma e a subtração dos números.
            Após o clique em um link, exibir uma sugestão de seis números não repetidos entre 1 e 60 para a mega-sena. Esses números devem ser gerados em um Servlet e retornados para exibição no browser do cliente.

#           Lista de Exercícios 06 

        OBS: Todas as questões desta lista devem ser resolvidas em uma única aplicação Web. Desse modo, você deve enviar um único arquivo WAR contendo toda a aplicação com as resoluções de todas as questões da lista e também com o código fonte.  A geração do arquivo WAR pode ser realizada através da opção de Exportação do Eclipse.
        Crie uma única aplicação Web com as funcionalidades abaixo. A página principal da aplicação deverá conter um menu com links para as demais funcionalidades.

            Crie uma classe Produto com codigo, nome, descrição e quantidade do produto.
            Crie uma página html que mostre alguns produtos com seus respectivos preços e que permita a adição deles em um carrinho de compras (lista de produtos) que deve ser armazenado no contexto de sessão ao chamar um servlet específico. 
                A adição de produtos deve ser feita através de AJAX ao clicar sobre um link ou botão Adicionar. 
                Um botão Mostrar Carrinho deve abrir uma janela Modal para mostrar os itens do Carrinho de Compras. 
                    Um Servlet específico deve retornar os itens do carrinho de compras. 
                    Este Servlet deve ser chamado via AJAX quando o botão Mostrar Carrinho for clicado para preencher os conteúdos que aparecerão na janela Modal.
            Crie um servlet para criar um contador e incrementá-lo a cada acesso a este servlet (A página principal da aplicação chama este servlet). O contador deve ser armazenado em um Cookie no cliente e ter a duração de 1 mês. Depois disso, o servlet deve redirecionar o cliente para uma página html capaz de mostrar o valor atual do contador via JavaScript (ver acesso a valores de cookies via Javascript: https://www.w3schools.com/js/js_cookies.asp).    
            
 #           Lista de Exercícios 07  
                OBS: Todas as questões desta lista devem ser resolvidas em uma única aplicação Web. Desse modo, você deve enviar um único arquivo WAR contendo toda a aplicação com as resoluções de todas as questões da lista e também com o código fonte.  A geração do arquivo WAR pode ser realizada através da opção de Exportação do Eclipse.
                Crie uma única aplicação Web com as funcionalidades abaixo. A página principal da aplicação (home) deverá conter um menu com links para as demais funcionalidades.
                Crie uma página html com um formulário de login para preenchimento de usuário e senha.
                Crie um servlet para login que recebe os parâmetros usuário e senha. Se usuário e senha forem 'admin' e 'teste1234', respectivamente, criar um atributo no escopo de sessão (mecanismo de autenticação). O nome do atributo deve ser 'usuario' e seu valor deve ser 'admin'. Isso significa que o usuário está logado (autenticado). Depois disso, o servlet deve redirecionar o usuário para a página home da aplicação. A opção de login deve estar disponível para acesso na página home, caso o usuário não esteja logado.
                Crie um servlet para logout. Esse servlet deve eliminar a sessão e redirecionar o usuário para a página home da aplicação. A opção de logout deve estar disponível para acesso em todas as páginas da aplicação, caso o usuário esteja logado.
                Sua aplicação não deve permitir acesso não autorizado às suas funcionalidades, ou seja, deve ter um mecanismo de autorização. Para isso, crie um filtro que force o login, caso o usuário não esteja logado e tente acessar qualquer página que não seja a página de login. 
                Crie uma lista de tarefas que deve ser armazenada na sessão do usuário logado no sistema. Esta lista deve permitir a inclusão, alteração e remoção de tarefas para cada usuário. 
                
#            Lista de Exercícios 08 
        Refatore a Lista de Exercícios 05 para que ela possa usar JSP. O Servlet deve continuar gerando os dados, mas sua exibição deve ser feita através de páginas JSP.
        Evite ao máximo o uso de Scriptlets. Quando precisar usar código Java tente fazê-lo em um Servlet que encaminha o resultado para o JSP.
        Use Expression Language (EL) sempre que possível.
        Use em todas as páginas da aplicação um único cabeçalho e um único rodapé que devem ser incluídos (include) no JSP a partir de dois arquivos externos, ou seja, um para o cabeçalho e outro para o rodapé.
        Crie uma página de erro da aplicação. Em caso de qualquer erro HTTP ou de execução, o usuário deve ser redirecionado para a página de erro....
       
