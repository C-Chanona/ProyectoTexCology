package com.upchiapas.texcology.models;

import java.util.ArrayList;

public class AutenticarUsuario {
  private ArrayList <Usuario> usuarios = new ArrayList<>();

  public AutenticarUsuario()
  {
      usuarios.add(new Usuario("Carlos","Chanona", "kakaroto"));
      usuarios.add(new Usuario("Yamili", "Yami", "8246"));
  }

  public boolean validarUsuario(String username, String password) {
      boolean status = false;
      Usuario user = findUsuario(username);
      if(user != null && user.getContraseña().equals(password))
          status = true;
      return status;
  }

      private Usuario findUsuario(String username)
      {
          Usuario u = null;
          boolean status = false;
          int i = 0;
          while(!status && i < usuarios.size()) {
              if (usuarios.get(i).getUsuario().equals(username)) {
                  u = usuarios.get(i);
                  status = true;
              }
              i++;
          }
          return u;
      }
  }