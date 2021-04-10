# Introdução a arquitetura da plataforma Android com Kotlin 1/3 (Jamille Ferreira)
> Segurança do sistema

## Segurança do sistema

Objetivos:
- Aprender práticas recomendadas de segurança
- Mostrar um apanhado geral das práticas de segurança

[ Material base - Práticas recomendadas ](https://developer.android.com/topic/security/best-practices?hl=pt-br)
[ Material base - Dicas de segurança ](https://developer.android.com/training/articles/security-tips?hl=pt-br)
A segurança é um assunto muito importante na área de TI em vista que trabalhamos diretamente com o uso dos dados dos usuários ou das empresas, e devemos sempre, como desenvolvedores, observadar a segurança dos nosso aplicativos a fim de que possamos construir aplicativos confiáveis e seguros.
A documentação oficial deixa clara a intenção do Android em trabalhar a segurança da plataforma com atualização e desenvolvimento de tecnologias de segurança. Mas eles compartilham essa responsabilidade de segurança com nós desenvolvedores, a fim de que cada vez mais os aplicativos sejam desenvolvidos com segurança para os usuários.

#### Práticas recomendadas para segurança de apps

- **Aplicar uma comunicação segura** : protegendo os dados trocados entre seu aplicativo e fontes exteriores, melhorando a estabilidade e a segurança nas comunicações e trocas de arquivos.
- **Oferecer as permissões corretas** : construir apps que solicitem as permições mínimas requeridas a seu funcionamento e se possível renunciar algumas permissões quando não houver mais necessidade de utilizar algum recurso.
- **Armazenar dados de forma segura** : os apps tem aecssos a informações confidencias mas esses devem ser construidos a proteger adequadamente esses dados.
- **Manter os serviços e as dependências atualizados** : manter os pontos de comunicação mais seguros com serviços e dependências atualizados.

#### Dicas de segurança

O Android inclui recursos de seguranças integrados que reduzem significativamente a frequencia e os impactos dos problemas de segurança dos aplicativos. O sistema é protegido para o desenvolviemnto de apps com permissões padrões do sistema e dos arquivos, evitando a necessidade de tomadas de decições difíceis sobre a segurança do app. 

- **Armazenamento de dados**
  - _Armazenamento Interno_ : Por padrão os arquivos só podem ser acessados pelo app.
  - _Armazenamento Externo_ : Os arquivos podem ser lidos e gravados globalmente, podendo ser manipulados por outros apps. É fortemente recomendádo a não se gravar arquivos confidencias nesse tipo de armazenamento.
  - _Usar provedores de conteúdo_ : Os provedores oferecem mecanismos de armazenamento que podem ser limitados ao app ou exportado para permissão de outros apps, basta configurar para melhor atender as necessidades do app.
- **Usar permissões** : Recursos e dados devem ser compartilhados de forma explicita utilizando as permissões a recursos não fornecidos por padrão no sandbox do Android.

## Segurança com Dados

[ Material Base - Segurança com dados ](https://developer.android.com/topic/security/data?hl=pt-br)

A biblioteca Security fornece uma implementação das práticas recomendadas de segurança relacionadas à leitura e gravação de dados em repouso, bem como à criação e verificação de chaves. Essa fornece também configurações padrão de seguras com os seguintes níveis:

- Segurança forte que equilibra ótima criptografia e bom desempenho
- Segurança máxima

## Segurança de rede

[ Material Base - Segurança com HTTPS e SSL ](https://developer.android.com/training/articles/security-ssl?hl=pt-br)
[ Material Base - Configurações de segurança de rede ](https://developer.android.com/training/articles/security-config?hl=pt-br)

 O recurso de configurações de segurança de rede permite que os apps personalizem essas configurações em um arquivo declarativo e seguro sem modificar o código do app. Os principais recursos são:

- Âncoras de confiança personalizadas.
- Substituições somente de depuração.
- Cancelar uso de tráfego de texto simples.
- Fixar certificados.

#### SafetyNet

O SafetyNet oferece um conjunto de serviços e APIs que ajudam a proteger seu app contra ameaças à segurança, incluindo adulteração de dispositivos, URLs incorretos, apps potencialmente nocivos e usuários falsos.

- **API SafetyNet Attestation** : oferece serviços para determinar se um dispositivo que executa seu app está de acordo com os testes de compatibilidade do Android.
- **API SafetyNet Safe Browsing** : oferece serviços para determinar se um URL foi marcado como ameaça conhecida pelo Google.
- **API SafetyNet reCAPTCHA** : protege seu app contra tráfego malicioso.
- **API SafetyNet Verify Apps** : protege dispositivos contra apps potencialmente nocivos.

## Criptografia

[ Material Base - Criptografia ](https://developer.android.com/guide/topics/security/cryptography?hl=pt-br) 

- Especificar um provedor apenas com o sistema Android Keystore
- Escolher um algoritmo recomendado
- Complexidades de implementção
- Funcionalidades suspensas
- Confirmação fornecidas pelo Android

## Aplicativos Potencialmente Nocivos (PHAs)

[ Material Base - PHA ](https://developers.google.com/android/play-protect/potentially-harmful-applications)


São aplicativos que podem colocar usuários, dados dos usuários ou dispositivos em riscos. Esses aplicativos são frequentemente genericamente referidos como malware.
Os aplicativos são sinalizados como um PHA se eles claramente representam um risco para alguns ou todos os dispositivos e usuários Android.

> [Iniciando um programa de divulgação de vulnerabilidade (Starting a Vulnerability Disclosure Program)](https://developers.google.com/android/play-protect/starting-a-vdp)