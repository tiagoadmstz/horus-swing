package com.cooperstandard.dao.extrusao;

import com.cooperstandard.dbs.ConexaoSql;
import com.cooperstandard.model.ModelLinha;
import java.util.ArrayList;

/**
 *
 * @author rsouza10
 */
public class DAOLinha extends ConexaoSql {

    public int salvarLinhaDAO(ModelLinha pModelModelLinha) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO Cad_Linha ("
                    + "ORDEM,"
                    + "LINHA,"
                    + "TIPO_LINHA,"
                    + "SETOR,"
                    + "N_PLANO,"
                    + "CONTATO_CHAVE,"
                    + "EQUIPE_PRINCIPAL,"
                    + "DATA_INICIAL"
                    + ") VALUES ("
                    + "'" + pModelModelLinha.getOrdem() + "',"
                    + "'" + pModelModelLinha.getLinha() + "',"
                    + "'" + pModelModelLinha.getTipo_linha() + "',"
                    + "'" + pModelModelLinha.getSetor() + "',"
                    + "'" + pModelModelLinha.getN_plano() + "',"
                    + "'" + pModelModelLinha.getContatoChave() + "',"
                    + "'" + pModelModelLinha.getEquipe_principal() + "',"
                    + "'" + pModelModelLinha.getData_inicial() + "'"
                    + ");"
            );

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }

    }

    public ModelLinha getLinhaDAO(int pCodigo) {
        ModelLinha modelLinha = new ModelLinha();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "ID_LINHA,"
                    + "ORDEM,"
                    + "LINHA,"
                    + "TIPO_LINHA,"
                    + "SETOR,"
                    + "N_PLANO,"
                    + "CONTATO_CHAVE,"
                    + "EQUIPE_PRINCIPAL,"
                    + "DATA_INICIAL "
                    + "FROM "
                    + "Cad_Linha"
                    + " WHERE"
                    + " ID_LINHA= '" + pCodigo + "'"
                    + ";"
            );
            while (this.getResultSet().next()) {
                modelLinha.setId_linha(this.getResultSet().getInt(1));
                modelLinha.setOrdem(this.getResultSet().getInt(2));
                modelLinha.setLinha(this.getResultSet().getString(3));
                modelLinha.setTipo_linha(this.getResultSet().getString(4));
                modelLinha.setSetor(this.getResultSet().getString(5));
                modelLinha.setN_plano(this.getResultSet().getString(6));
                modelLinha.setContatoChave(this.getResultSet().getString(7));
                modelLinha.setEquipe_principal(this.getResultSet().getString(8));
                modelLinha.setData_inicial(this.getResultSet().getString(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelLinha;
    }

    public ModelLinha getLinhaDAO(String pNome) {
        ModelLinha modelLinha = new ModelLinha();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "ID_LINHA,"
                    + "ORDEM,"
                    + "LINHA,"
                    + "TIPO_LINHA,"
                    + "SETOR,"
                    + "N_PLANO,"
                    + "CONTATO_CHAVE,"
                    + "EQUIPE_PRINCIPAL,"
                    + "DATA_INICIAL "
                    + "FROM "
                    + "Cad_Linha"
                    + " WHERE"
                    + " LINHA= '" + pNome + "' and SETOR='Extrusão'"
                    + ";"
            );
            while (this.getResultSet().next()) {
                modelLinha.setId_linha(this.getResultSet().getInt(1));
                modelLinha.setOrdem(this.getResultSet().getInt(2));
                modelLinha.setLinha(this.getResultSet().getString(3));
                modelLinha.setTipo_linha(this.getResultSet().getString(4));
                modelLinha.setSetor(this.getResultSet().getString(5));
                modelLinha.setN_plano(this.getResultSet().getString(6));
                modelLinha.setContatoChave(this.getResultSet().getString(7));
                modelLinha.setEquipe_principal(this.getResultSet().getString(8));
                modelLinha.setData_inicial(this.getResultSet().getString(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelLinha;
    }

    public ArrayList<ModelLinha> getListaLinhaDAO() {
        ArrayList<ModelLinha> listaLinha = new ArrayList();
        ModelLinha modelLinha = new ModelLinha();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "ID_LINHA,"
                    + "ORDEM,"
                    + "LINHA,"
                    + "TIPO_LINHA,"
                    + "SETOR,"
                    + "N_PLANO,"
                    + "CONTATO_CHAVE,"
                    + "EQUIPE_PRINCIPAL,"
                    + "DATA_INICIAL"
                    + " FROM"
                    + " Cad_Linha where SETOR = 'Extrusão' ORDER BY LINHA "
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelLinha = new ModelLinha();
                modelLinha.setId_linha(this.getResultSet().getInt(1));
                modelLinha.setOrdem(this.getResultSet().getInt(2));
                modelLinha.setLinha(this.getResultSet().getString(3));
                modelLinha.setTipo_linha(this.getResultSet().getString(4));
                modelLinha.setSetor(this.getResultSet().getString(5));
                modelLinha.setN_plano(this.getResultSet().getString(6));
                modelLinha.setContatoChave(this.getResultSet().getString(7));
                modelLinha.setEquipe_principal(this.getResultSet().getString(8));
                modelLinha.setData_inicial(this.getResultSet().getString(9));

                listaLinha.add(modelLinha);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();

        }
        return listaLinha;
    }

    public ArrayList<ModelLinha> getListaLinhaGeralDAO() {
        ArrayList<ModelLinha> listaLinha = new ArrayList();
        ModelLinha modelLinha = new ModelLinha();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "ID_LINHA,"
                    + "ORDEM,"
                    + "LINHA,"
                    + "TIPO_LINHA,"
                    + "SETOR,"
                    + "N_PLANO,"
                    + "CONTATO_CHAVE,"
                    + "EQUIPE_PRINCIPAL,"
                    + "DATA_INICIAL"
                    + " FROM"
                    + " Cad_Linha ORDER BY LINHA "
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelLinha = new ModelLinha();
                modelLinha.setId_linha(this.getResultSet().getInt(1));
                modelLinha.setOrdem(this.getResultSet().getInt(2));
                modelLinha.setLinha(this.getResultSet().getString(3));
                modelLinha.setTipo_linha(this.getResultSet().getString(4));
                modelLinha.setSetor(this.getResultSet().getString(5));
                modelLinha.setN_plano(this.getResultSet().getString(6));
                modelLinha.setContatoChave(this.getResultSet().getString(7));
                modelLinha.setEquipe_principal(this.getResultSet().getString(8));
                modelLinha.setData_inicial(this.getResultSet().getString(9));

                listaLinha.add(modelLinha);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();

        }
        return listaLinha;
    }

    public ArrayList<ModelLinha> getListaLinhaDDZDAO() {
        ArrayList<ModelLinha> listaLinha = new ArrayList();
        ModelLinha modelLinha = new ModelLinha();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "ID_LINHA,"
                    + "ORDEM,"
                    + "LINHA,"
                    + "TIPO_LINHA,"
                    + "SETOR,"
                    + "N_PLANO,"
                    + "CONTATO_CHAVE,"
                    + "EQUIPE_PRINCIPAL,"
                    + "DATA_INICIAL"
                    + " FROM"
                    + " Cad_Linha where SETOR = 'Extrusão' and LINHA <> 'L01' and LINHA <> 'L03' and LINHA <> 'L03ATB' and LINHA <> 'L04ATB'"
                    + "and LINHA <> 'L05' and LINHA <> 'L10' and LINHA <> 'L13' and LINHA <> 'L14' and LINHA <> 'L16' and LINHA <> 'Carrossel 153' and LINHA <> 'Carrossel 197' and LINHA <> 'Carrossel 37' ORDER BY LINHA "
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelLinha = new ModelLinha();
                modelLinha.setId_linha(this.getResultSet().getInt(1));
                modelLinha.setOrdem(this.getResultSet().getInt(2));
                modelLinha.setLinha(this.getResultSet().getString(3));
                modelLinha.setTipo_linha(this.getResultSet().getString(4));
                modelLinha.setSetor(this.getResultSet().getString(5));
                modelLinha.setN_plano(this.getResultSet().getString(6));
                modelLinha.setContatoChave(this.getResultSet().getString(7));
                modelLinha.setEquipe_principal(this.getResultSet().getString(8));
                modelLinha.setData_inicial(this.getResultSet().getString(9));

                listaLinha.add(modelLinha);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();

        }
        return listaLinha;
    }

    public ArrayList<ModelLinha> getListaLinhaATBDDZDAO() {
        ArrayList<ModelLinha> listaLinha = new ArrayList();
        ModelLinha modelLinha = new ModelLinha();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "ID_LINHA,"
                    + "ORDEM,"
                    + "LINHA,"
                    + "TIPO_LINHA,"
                    + "SETOR,"
                    + "N_PLANO,"
                    + "CONTATO_CHAVE,"
                    + "EQUIPE_PRINCIPAL,"
                    + "DATA_INICIAL"
                    + " FROM"
                    + " Cad_Linha where LINHA = 'L03ATB' or LINHA = 'L04ATB'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelLinha = new ModelLinha();
                modelLinha.setId_linha(this.getResultSet().getInt(1));
                modelLinha.setOrdem(this.getResultSet().getInt(2));
                modelLinha.setLinha(this.getResultSet().getString(3));
                modelLinha.setTipo_linha(this.getResultSet().getString(4));
                modelLinha.setSetor(this.getResultSet().getString(5));
                modelLinha.setN_plano(this.getResultSet().getString(6));
                modelLinha.setContatoChave(this.getResultSet().getString(7));
                modelLinha.setEquipe_principal(this.getResultSet().getString(8));
                modelLinha.setData_inicial(this.getResultSet().getString(9));

                listaLinha.add(modelLinha);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();

        }
        return listaLinha;
    }

    public boolean atualizarLinhaDAO(ModelLinha pModelLinha) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE Cad_Linha SET "
                    + " ORDEM= '" + pModelLinha.getOrdem() + "',"
                    + " LINHA= '" + pModelLinha.getLinha() + "',"
                    + " TIPO_LINHA= '" + pModelLinha.getTipo_linha() + "',"
                    + " SETOR= '" + pModelLinha.getSetor() + "',"
                    + " N_PLANO= '" + pModelLinha.getN_plano() + "',"
                    + " CONTATO_CHAVE= '" + pModelLinha.getContatoChave() + "',"
                    + " EQUIPE_PRINCIPAL= '" + pModelLinha.getEquipe_principal() + "',"
                    + " DATA_INICIAL= '" + pModelLinha.getData_inicial() + "'"
                    + " WHERE "
                    + " ID_LINHA= '" + pModelLinha.getId_linha() + "'"
                    + ";"
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();

        }

    }

    public boolean excluirLinhaDAO(long pCodigo) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM Cad_Linha "
                    + "WHERE "
                    + " ID_LINHA= '" + pCodigo + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
