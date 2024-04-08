package br.com.alura.musicasBD.dados.DAO

import br.com.alura.musicasBD.dados.entity.BandaEntity
import br.com.alura.musicasBD.extensions.toEntity
import br.com.alura.musicasBD.extensions.toModel
import br.com.alura.musicasBD.modelos.Banda
import javax.persistence.EntityManager

class BandaDAO(manager: EntityManager)
    : DAO<Banda, BandaEntity>(manager, BandaEntity::class.java)
{
    override fun toModel(entity: BandaEntity): Banda {
        return entity.toModel()
    }

    override fun toEntity(model: Banda): BandaEntity {
        return model.toEntity()
    }
}