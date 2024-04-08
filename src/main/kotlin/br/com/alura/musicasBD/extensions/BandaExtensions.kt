package br.com.alura.musicasBD.extensions

import br.com.alura.musicasBD.dados.entity.BandaEntity
import br.com.alura.musicasBD.modelos.Banda

fun Banda.toEntity() = BandaEntity(this.nome, this.descricao, this.id)
fun BandaEntity.toModel() = Banda(this.nome, this.descricao, this.id)
