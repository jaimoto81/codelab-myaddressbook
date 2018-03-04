/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.myaddressbook

/**
 * POJO de Contacto
 * Problemas normales de un POJO
 * 1. ¿Cuales pueden ser nulos?
 * 2. ¿Cuales son mutables, pueden cambiar y cuales no?
 * 3. De POJO a una clase interna de una linea ..
 * internal class Contact(val firstName: String, val lastName: String, var email: String?)
 *  val -> readonly
 *  var -> mutable
 *  firstName y lastName nunca serán nulas, ya que se declaro el tipo y no tiene ?
 *  email puede ser nulo ?
 *
 *  data -> Inicialmente era toString salia @454sfToSring(), ahora la clase Data sale bonito (https://kotlinlang.org/docs/reference/data-classes.html)
 *
 *
 */
internal data class Contact(val firstName: String, val lastName: String, var email: String?)
