FROM node:18

WORKDIR /app

COPY . .

RUN rm -rf node_modules package-lock.json && npm install

EXPOSE 4400

CMD ["npx", "ng", "serve", "--host", "0.0.0.0", "--port", "4400"]
