const express = require('express');
const app = express();
const port = 3000;

app.get('/', (req, res) => {
  res.send('Servidor Node rodando com sucesso!');
});

app.listen(port, () => {
  console.log(`App rodando em http://localhost:${port}`);
});