import csv
import json
from urllib.request import Request, urlopen


url = "https://?????.execute-api.us-east-1.amazonaws.com/dev/api"

def import_file():    
    with open('wb0000000001.csv', newline='') as csvfile:
        spamreader = csv.reader(csvfile, delimiter=';', quotechar='|')
        for row in spamreader:
            if (row[0] == 'wa3'):                           #Rede - Tipo
                #import_rede_tipo(row)
                pass
            elif (row[0] == 'wb2'):                         #Agente Externo
                pass
                # import_agente_externo(row)
            elif (row[0] == 'wa1'):                         #Usuarios
                pass
            elif (row[0] == 'wb8'):                         #Pavimento Tipo
                pass
                # import_pavimento_tipo(row)
            elif (row[0] == 'wa2'):                         #Serviço Tipo Executado
                pass
                # import_servico_tipo_executado(row)                
            elif (row[0] == 'wa4'):                         #Rede - Material
                pass
                # import_rede_material(row)                
            elif (row[0] == 'wa7'):                         #Material
                pass
                # import_material(row)                
            elif (row[0] == 'wa6'):                         #Motivo Encerramento
                pass
                # import_motivo_encerramento(row)                
            elif (row[0] == 'wa8'):                         #Local Ocorrência
                pass
                # import_local_ocorrencia(row)                
            elif (row[0] == 'wa5'):                         #Rede - Diâmetro
                pass
                # import_rede_diametro(row)                     
            elif (row[0] == 'wb4'):                         #Rede - Causa Vazamento
                pass
                # import_rede_causa_vazamento(row)                                     
            elif (row[0] == 'wb3'):                         #Ordem de Serviço
                pass
                # import_ordem_servico(row)                                     
            elif (row[0] == 'wd1'):                         #Corte Tipo
                pass
                # import_corte_tipo(row)                                     
            elif (row[0] == 'wd2'):                         #HidrometroLocalArmazenagem
                pass
                # import_hidrometro_local_armazenagemo(row)    
            elif (row[0] == 'wd3'):                         #HidrometroLocalInstalacao
                pass
                # import_hidrometro_local_instalacao(row)                                    
            elif (row[0] == 'wd4'):                         #HidrometroProtecao
                pass
                # import_hidrometro_protecao(row)                                                    
            elif (row[0] == 'wd5'):                         #HidrometroSituacao
                pass
                # import_hidrometro_situacao(row)
            elif (row[0] == 'wd6'):                         #HidrometroTipoInstalacao
                pass
                # import_hidrometro_instalacao(row)                                                    
            elif (row[0] == 'wd7'):                         #HidrometroTipoSubstituicao
                pass
                # import_hidrometro_tipo_substituicao(row)                                                    
            elif (row[0] == 'wd8'):                         #LigacaoAguaSituacao
                pass
                # import_ligacao_agua_situacao(row)                                                                    
            elif (row[0] == 'wd9'):                         #LigacaoEsgotoSituacao
                pass
                # import_ligacao_esgoto_situacao(row)                                                                    
            elif (row[0] == 'we1'):                         #MotivoCorte
                pass
                # import_motivo_corte(row)                                                                    
            elif (row[0] == 'we2'):                         #ReligacaoTipo
                pass
                # import_religacao_tipo(row)                                                                    
            elif (row[0] == 'wa9'):                         #Equipe
                pass
                # import_equipe(row)                                                                    
            elif (row[0] == 'wy1'):                         #Checklist - Grupo
                pass
                # import_checklist_grupo(row)                                                                    
            elif (row[0] == 'wy2'):                         #Checklist - Item
                pass
                # import_checklist_item(row)                                                                    
            elif (row[0] == 'wy3'):                         #Checklist - Opção
                pass
                # import_checklist_opcao(row)                                                                    
            elif (row[0] == 'wy4'):                         #Interrupcao Motivo
                pass
                # import_interrupcao_motivo(row)                                                                    
            elif (row[0] == 'wy5'):                         #Funcionario
                pass
                # import_funcionario(row)                                                                    
            elif (row[0] == 'wy6'):                         #Veículos
                pass
            elif (row[0] == 'wy7'):                         #Logradouro Tipp
                pass
                import_logradouro_tipo(row)                                                                    
                


# Send to API
def send_to_api(url, data):
    headers = {
        "Content-Type": "application/json"
    }
    request = Request(
        url,
        json.dumps(data).encode('ascii'),
        headers
    )
    with urlopen(request) as response:
        json_response = json.load(response)
    print(json_response)


# Logradouro Tipp
def import_logradouro_tipo(row):
    header = ['idLogradouro', 'descricao']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_logradouro_tipo", result)


# Veículos
def import_veiculos(row):
    header = ['matricula', 'nomeFuncionario', 'numeroCNH', 'senha', 'nomeSetor']
    result = dict(zip(header, row[1:]))
    print(result)


# Funcionario
def import_funcionario(row):
    header = ['matricula', 'nomeFuncionario', 'numeroCNH', 'senha', 'nomeSetor']
    result = dict(zip(header, row[1:]))
    print(result)


# Interrupcao Motivo
def import_interrupcao_motivo(row):
    header = ['idInterrupcaoMotivo', 'descricao', 'indicadorEnviarSMSInicio', 'indicadorEnviarSMSFim', 'indicadorInicioAtividade', 
        'indicadorFimAtividade', 'indicadorChecklistSaida', 'indicadorChecklistRetorno', 'indicadorSolicitarKMInicio',
        'indicadorSolicitarKMFim']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_interrupcao_motivo", result)


# Checklist - Opção
def import_checklist_opcao(row):
    header = ['idOpcao', 'idItem', 'descricaoOpcao']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_checklist_opcao", result)


# Checklist - Item
def import_checklist_item(row):
    header = ['idItem', 'idGrupo', 'descricaoItem', 'idOpcaoChecked']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_checklist_item", result)


# Checklist - Grupo
def import_checklist_grupo(row):
    header = ['idGrupo', 'descricaoGrupo']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_checklist_grupo", result)


# Equipe
def import_equipe(row):
    header = ['idEquipe', 'nomeEquipe']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_equipe", result)
    

# ReligacaoTipo
def import_religacao_tipo(row):
    header = ['idTipoReligacao', 'descricaoTipoReligacao']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_religacao_tipo", result)


# MotivoCorte
def import_motivo_corte(row):
    header = ['idMotivoCorte', 'descricaoMotivoCorte']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_motivo_corte", result)


# LigacaoEsgotoSituacao
def import_ligacao_esgoto_situacao(row):
    header = ['idSituacaoLigacaoEsgoto', 'descricaoSituacaoLigacaoEsgoto']
    result = dict(zip(header, row[1:]))
    print(result)

# LigacaoAguaSituacao
def import_ligacao_agua_situacao(row):
    header = ['idSituacaoLigacaoAgua', 'descricaoSituacaoLigacaoAgua']
    result = dict(zip(header, row[1:])) 
    

# HidrometroTipoSubstituicao
def import_hidrometro_tipo_substituicao(row):
    header = ['idTipoSubstituicaoHM', 'descricaoTipoSubstituicaoHM']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_hidrometro_tipo_substituicao", result)


# HidrometroTipoInstalacao
def import_hidrometro_instalacao(row):
    header = ['idTipoInstalacaoHM', 'descricaoTipoInstalacaoHM']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_hidrometro_instalacao", result)


# HidrometroSituacao
def import_hidrometro_situacao(row):
    header = ['idSituacaoHidrometro', 'descricaoSituacaoHidrometro']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_hidrometro_situacao", result)


# HidrometroProtecao
def import_hidrometro_protecao(row):
    header = ['idProtecaoHidrometro', 'descricaoProtecaoHidrometro']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_hidrometro_protecao", result)


# HidrometroLocalInstalacao
def import_hidrometro_local_instalacao(row):
    header = ['idLocalInstalacaoHidrometro', 'descricaoLocalInstalacaoHidrometro']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_hidrometro_local_instalacao", result)


# HidrometroLocalArmazenagem
def import_hidrometro_local_armazenagemo(row):
    header = ['idLocalArmazenagemHidrometro', 'descricaoLocalArmazenagemHidrometro']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_hidrometro_local_armazenagem", result)
    


# Corte Tipo
def import_corte_tipo(row):
    header = ['idCorteTipo', 'descricaoCorteTipo']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_corte_tipo", result)


# Ordem de Serviço
def import_ordem_servico(row):
    header = ['numeroOS', 'numeroRA', 'situacaoOS', 'situacaoRA', 'desricaoSituacaoRA', 'descricaoSituacaoOS', 
              'dataGeracaoOS', 'dataGeracaoRA', 'idTipoServico', 'descricaoTipoServico', 'observacaoOS', 
              'observacaoRA', 'idUnidadeGeracao', 'descricaoUnidadeGeracao', 'logradouro', 'bairro', 'numeroImovel',
              'idCliente', 'idImovel', 'nomeCliente', 'idMovimentoRecebito', 'idColetorEnvioItem', 'idEquipeExecucao',
              'descricaoEquipeExecucao', 'idColetorEnvio', 'Id. do Coletor', 'Mobile ID', 'Descrição do Coletor', 
              'Data do Movimento', 'Nome do Arquivo', 'Hora do Movimento', 'Id. Ordem de Serviço', 'idOrdemServico',
              'dataEncerramentoOS', 'numeroHidrometro', 'Numero do Selo', 'Ano de Fabricacao', 'Complemento do Endereço',
              'Quadra', 'numeroLote', 'numeroSublote', 'sequenciaRota', 'idSetorComercial', 'latitude', 'longitude']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_ordem_servico", result)


# Rede - Causa Vazamento
def import_rede_causa_vazamento(row):
    header = ['idCausaVazamento', 'descricaoCausaVazamento']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_rede_causa_vazamento", result)


# Rede - Diâmetro
def import_rede_diametro(row):
    header = ['idLocalOcorrencia', 'descricaoLocalOcorrencia']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_rede_diametro", result)


# Local Ocorrência
def import_local_ocorrencia(row):
    header = ['idLocalOcorrencia', 'descricaoLocalOcorrencia']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_local_ocorrencia", result)


# Motivo Encerramento
def import_motivo_encerramento(row):
    header = ['idMotivoEncerramento', 'descricaoMotivoEncerramento']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_motivo_encerramento", result)


# Material
def import_material(row):
    header = ['idMaterial', 'descricaoMaterial', 'idUnidadeMedida', 'descricaoUnidadeMedida']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_material", result)


# Rede - Material
def import_rede_material(row):
    header = ['idRedeMaterial', 'descricaoRedeMaterial']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_rede_material", result)
    

# Serviço Tipo Executado
def import_servico_tipo_executado(row):
    header = ['idServicoTipo', 'descricaoServicoTipo']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_servico_tipo_executado", result)


# Rede - Tipo
def import_rede_tipo(row):
    header = ['idRedeTipo', 'descricaoRedeTipo']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_rede_tipo", result)


# Agente Externo 
def import_agente_externo(row):
    header = ['idAgenteExterno', 'agenteExterno']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_agente_externo", result)


# Pavimento Tipo
def import_pavimento_tipo(row):
    header = ['idPavimentoTipo', 'descricaoPavimentoTipo']
    result = dict(zip(header, row[1:]))
    send_to_api(url + "/tables?tablename=tasko_pavimento_tipo", result)


if __name__ == '__main__':
    import_file()    



