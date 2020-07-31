const schedule = require ('node-schedule')


//Executando uma tareta temporizada a cada 5 seg as 19h do dia 5 (sexta) 
const tarefa1 = schedule.scheduleJob('*/5 * 19 * * 5', function(){ 
    console.log('Executando tarefa1', new Date().getSeconds())
})

setTimeout(function(){
    tarefa1.cancel()
    console.log('Cancelando Tarefa 1!')
}, 20000)

const regra = new schedule.RecurrenceRule();

regra.dayOfWeek = [new schedule.Range(1, 5)] 
regra.hour = 19
regra.second = 30

const tarefa2 = schedule.scheduleJob(regra, function(){
    console.log('Executando tarefa 2!', new Date().getSeconds())
})