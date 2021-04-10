# Introdução a arquitetura da plataforma Android com Kotlin 3/3 (Jamille Ferreira)
> Android App Bundle

## Android App Bundle

Objetivos:
- Saber o que é o Android App Bundle
- Visão geral das etapas para começar a criar Android App Bundle

[ Material Base - App Bundle ](https://developer.android.com/guide/app-bundle?hl=pt-br)

Um _Android App Bundle_ é um formato de publicação que inclui todos os recursos e códigos compilados do seu app e adia a geração e a assinatura do APK no Google Play.  
O Google Play usa o pacote de apps para gerar e disponibilizar APKs otimizados para cada configuração de dispositivo. Assim, somente o código e os recursos necessários para um dispositivo específico são salvos para executar o app.

#### Etapas para criação de Android App Bundles

1. Iniciar
  - Baixar o Android Studio 3.2 ou superior
  - Adicionar suporte para Play Feature Delivery
  - Criar um Android App Bundle
  - Testar seu Android App Bundle
  - Inscrever-se no aplicativo Play App Signing
  - Publicar seu pacote de aplicativos no Google
1. Teste seu pacote de aplicativos
  - Testar seu Android App Bundle localmente usando o bundle tool
  - Compartilhar seu aplicativo com um URL
  - Configurar um teste aberto, fechado ou interno
1. Baixe os módulos
  - Baixar os módulos de recursos com a Play Core Library
1. Uma observação sobre Instant Apps*
1. Restrição de tamanho de download compactado
  - Downloads não devem ser superior a 150Mb
1. Problemas conhecidos
  - As instalações parciais de apps transferidos por sideload falham em todos os dispositivos certificados pelo Google e dispositivos com Android 10 (API de nível 29) ou mais recente.
  - Se você usa ferramentas que modificam dinamicamente as tabelas de recursos, os APKs gerados em pacotes de apps podem se comportar de maneira inesperada.
  - O download de módulos de recursos exige que os dispositivos tenham uma versão recente do app Play Store instalada.
  - [Mais casos](https://developer.android.com/guide/app-bundle?hl=pt-br)
1. O formato Android App Bundle
  - Android App Bundle é um arquivo com a extensão de arquivo **.aab**.
1. Visão geral dos APKs divididos
  - APK básico
  - APKs de configuração
  - APKs de módulo de recursos
1. Recursos adicionais
  - Amostras da API PlayCore
  - Amostra de carregamento do código dinâmico
  - Codelabs
  - Postagens do blog
  - Vídeos

## Google Play Instant

Objetivos:
- Visão geral do Google Play Instant
- Como funciona a experiência instantânea
- Permissão de experiências instantâneas reduzindo app
- Recursos adicionais

[ Material Base - Google Play Instant ](https://developer.android.com/topic/google-play-instant/overview?hl=pt-br)

O Google Play Instant permite que aplicativos e jogos nativos sejam iniciados em dispositivos com Android 5.0 (API de nível 21) ou versões mais recentes sem precisar de instalação. Você pode criar esses tipos de experiência, chamados de apps instantâneos e jogos instantâneos, usando o Android Studio.  
Ao permitir que os usuários executem um app ou jogo instantâneo, ação conhecida como fornecer uma experiência instantânea, você melhora a descoberta do seu app ou jogo, o que ajuda a gerar mais instalações e conquistar mais usuários ativos. Os apps e jogos instantâneos só podem usar um subconjunto de APIs no Android SDK e no Android NDK. Ao criar uma experiência instantânea, solicite apenas permissões compatíveis.

#### Como funciona a experiência instantânea

Com o Google Play Instant, os usuários podem tocar em um botão na Play Store, no app Google Play Games ou em um banner de site para usar um app ou jogo sem precisar instalá-lo.
Quando o Google Play recebe uma dessas solicitações de um app ou jogo instantâneo, ele envia os arquivos necessários para o dispositivo Android que enviou a solicitação. O dispositivo executa o app ou jogo.
As experiências instantâneas se enquadram em duas categorias: 
- Experiência "Testar" na Play Store.
- Jogos instantâneos no app Google Play Games.

#### Benefícios do Google Play Instant

- Permite experiências instantâneas reduzindo app
- Maior envolvimento do usuário ou instalações e sucesso nos negócios
- Ativa todas as superfícies instantâneas, incluindo o botão Experimente agora na PLay Store
- "Instant play" apresentada na página inicial no aplicativo da Google Play Games
- Publique seu pacote de aplicativos no Google Play