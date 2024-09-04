// iniciar a conexão com o banco de dados e retornar sua conexão

const { MongoClient } = require('mongodb')
let dbConnection
// mongo db atlas
// let url = 'mongodb+srv://maiadiego290:teste@cluster0.m2k62ou.mongodb.net/?retryWrites=true&w=majority'

module.exports = {
    connectToDb: (cb) => {
        MongoClient.connect('mongodb://localhost:27017/bookstore')
            .then((client) => {
                dbConnection = client.db()
                return cb()
            })
            .catch(err => {
                console.log(err)
                return cb(err)
            })
    },
    getDb: () => dbConnection
}