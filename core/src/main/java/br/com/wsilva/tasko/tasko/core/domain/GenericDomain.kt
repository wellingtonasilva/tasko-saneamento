package br.com.wsilva.tasko.tasko.core.domain

data class GenericDomain (
    var _id: Long = 0,
    /**
     * Data da última atualização na base de dados
     */
    var syncLastUpdate: String? = null,

    /**
     * Indicador que o registro Local deverá ser enviado sincronizado
     */
    var syncDirty: Int = 0,

    /**
     * Indicador que o registro Local deverá ser excluido na sincronização
     */
    var syncDeleted: Int = 0,

    /**
     * Data do Sincronismo / Data do servidor
     */
    var syncDateTime: String? = null,

    /**
     * Identificador único Local
     */
    var syncId: String? = null,

    /**
     * Reservado para o futuro...
     */
    var syncVersion: Int = 0,

    /**
     * Indicador que informa que o sistema poderá sincronizar
     */
    var syncCansync: Int = 0
)