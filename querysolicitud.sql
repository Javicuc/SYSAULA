SELECT
     Lista_Horarios.`Estado` AS Lista_Horarios_Estado,
     Materia.`ID_NRC` AS Materia_ID_NRC,
     Materia.`Clave` AS Materia_Clave,
     Materia.`Nombre` AS Materia_Nombre,
     Aula.`ID_Aula` AS Aula_ID_Aula,
     Aula.`Numero` AS Aula_Numero,
     Edificio.`ID_Nombre` AS Edificio_ID_Nombre,
     Horario.`Hora_Inicio` AS Horario_Hora_Inicio,
     Horario.`Hora_Final` AS Horario_Hora_Final,
     Horario.`Dia` AS Horario_Dia
FROM
     `Materia` Materia INNER JOIN `Lista_Horarios` Lista_Horarios ON Materia.`ID_NRC` = Lista_Horarios.`FK_Materia`
     INNER JOIN `Aula` Aula ON Lista_Horarios.`FK_Aula` = Aula.`ID_Aula`
     INNER JOIN `Edificio` Edificio ON Aula.`FK_Edificio` = Edificio.`ID_Nombre`
     INNER JOIN `Horario` Horario ON Materia.`ID_NRC` = Horario.`FK_Materia`