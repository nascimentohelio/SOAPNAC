
/**
 * RepositorioProdutoCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */

    package br.com.fiap.repositorio;

    /**
     *  RepositorioProdutoCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class RepositorioProdutoCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public RepositorioProdutoCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public RepositorioProdutoCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for listar method
            * override this method for handling normal response from listar operation
            */
           public void receiveResultlistar(
                    br.com.fiap.repositorio.RepositorioProdutoStub.ListarResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from listar operation
           */
            public void receiveErrorlistar(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for atualizar method
            * override this method for handling normal response from atualizar operation
            */
           public void receiveResultatualizar(
                    br.com.fiap.repositorio.RepositorioProdutoStub.AtualizarResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from atualizar operation
           */
            public void receiveErroratualizar(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for cadastrar method
            * override this method for handling normal response from cadastrar operation
            */
           public void receiveResultcadastrar(
                    br.com.fiap.repositorio.RepositorioProdutoStub.CadastrarResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cadastrar operation
           */
            public void receiveErrorcadastrar(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for remover method
            * override this method for handling normal response from remover operation
            */
           public void receiveResultremover(
                    br.com.fiap.repositorio.RepositorioProdutoStub.RemoverResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from remover operation
           */
            public void receiveErrorremover(java.lang.Exception e) {
            }
                


    }
    