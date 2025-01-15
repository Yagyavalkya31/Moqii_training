def training = ec.entity.makeValue("moqui.training.MoquiTraining")
//training.setFields(context, true, null, null)
training.trainingName = context.trainingName
training.trainingDate = context.trainingDate
training.trainingPrice = context.trainingPrice
training.trainingDuration = context.trainingDuration
training.setSequencedIdPrimary()
