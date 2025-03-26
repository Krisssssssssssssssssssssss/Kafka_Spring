# Stage 1: Build Angular app
FROM node:20 AS builder
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build --configuration=production

# Stage 2: Serve with NGINX
FROM nginx:alpine
COPY --from=builder /app/dist/frontend /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
