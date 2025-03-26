FROM node:18
WORKDIR /app
COPY . .
# Clean before install
RUN rm -rf node_modules package-lock.json && npm install
EXPOSE 4200
CMD ["npm", "start"]
