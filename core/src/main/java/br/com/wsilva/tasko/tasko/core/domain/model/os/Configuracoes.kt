package br.com.wsilva.tasko.tasko.core.domain.model.os

data class Configuracoes(
    var ftpIP: String? = null,
    var ftpUsuario: String? = null,
    var ftpSenha: String? = null,
    var ftpPorta: Int = 0,
    var dispositivoNome: String? = null,
    var dispositivoID: String? = null,
    var dispositivoPastaDownload: String? = null,
    var dispositivoPastaUpload: String? = null,
    var dispositivoPastaImage: String? = null,
    var utilizarFTPEnviarArquivos: Int = 0,
    var utilizarFTPReceberArquivos: Int = 0,
    var enviarArquivosAposExportacao: Int = 0,
    var enviarFotosViaFTP: Int = 0,
    var webURL: String? = null,
    var webNameSpace: String? = null,
    var utilizarWEBEnviarArquivos: Int = 0,
    var utilizarWEBPReceberArquivos: Int = 0,
    var enviarFotosViaWEB: Int = 0,
    var smsTelefone: String? = null,
    var enviarSmsAposIniciar: Int = 0,
    var enviarSmsAposEncerrar: Int = 0,
    var coletorEmpresa: String? = null,
    var coletorCodigo: String? = null,
    var coletorEquipe: String? = null,
    var idEquipe: Int? = null,
    var dispositivoSerial: String? = null,
    var permiteExecucaoEmParaleloOS: Int = 0,
    var exigeChecklist: Int = 0,
    var exigeInicioAtividade: Int = 0,
    var emailDestinatario: String? = null,
    var enviarEmailAposEncerrar: Int = 0,
    var enviarEmailAposExportar: Int = 0,
    var logomarca: Int = 0,

    //Configuraçao necessária para encerrar qualquer OS no sistema GSAN
    var gsanUsuarioId: Int = 0,
    var gsanUsuarioNome: String? = null,
    var gsanFuncionarioId: Int = 0,
    var gsanFuncionarioNome: String? = null,
    var dataProgramacao: String? = null,
    var quantidadeMinimaFotos: Int = 0,
    var quantidadeMaximaFotos: Int = 0,
    var ultimaLatitude: String? = null,
    var ultimaLongitude: String? = null
)