# BudgetMaster — Expenses Calculator (JavaScript)

Каленюк Анна - Team Lead, Developer
Марухін Владислав - Developer, Documenter, Designer

> BudgetMaster is a JavaScript-based Expenses Calculator to quickly record, categorize, and analyze personal or small-team spending. This README is tailored for a JS implementation (Node.js backend and optional JS frontend).

## Features
- Add, edit, and delete expenses
- Categories, tags, merchants, payment methods
- Recurring expenses and budget targets
- Dashboard: totals, by-category breakdown, period comparisons
- CSV / JSON import & export
- Optional multi-currency support
- Simple authentication (JWT) and per-user data
- Responsive UI (if frontend included)

## Tech stack
- javaScript

## Project structure (suggested)
A simple mono-repo layout:
- /server — Node.js API (Express)
- /client — Web frontend (React)
- /scripts — deployment / helper scripts

## API & Usage
Example HTTP endpoints (adjust to your implementation):

- Auth
  - POST /api/auth/register — register a user
  - POST /api/auth/login — authenticate, returns JWT

- Expenses
  - GET /api/expenses?from=2025-01-01&to=2025-12-31 — list expenses
  - POST /api/expenses — create expense
  - GET /api/expenses/:id — get expense
  - PUT /api/expenses/:id — update expense
  - DELETE /api/expenses/:id — delete expense

- Budgets & Reports
  - GET /api/reports/summary?period=month
  - POST /api/budgets — create budget

Example: create expense (curl)
```bash
curl -X POST http://localhost:4000/api/expenses \
  -H "Content-Type: application/json" \
  -H "Authorization: Bearer <JWT>" \
  -d '{
    "date": "2025-12-01",
    "amount": 23.50,
    "currency": "USD",
    "category": "Food",
    "merchant": "Corner Cafe",
    "notes": "Lunch with client",
    "payment_method": "Credit Card",
    "tags": ["business", "lunch"],
    "recurring": false
  }'
```

## Quick example expense JSON
```json
{
  "id": "e8f1b6a2",
  "date": "2025-12-01",
  "amount": 23.5,
  "currency": "USD",
  "category": "Food",
  "merchant": "Corner Cafe",
  "notes": "Lunch with client",
  "payment_method": "Credit Card",
  "tags": ["business", "lunch"],
  "recurring": false
}
```

## Import / Export
- Export CSV: date, amount, currency, category, merchant, notes, tags, payment_method
- Import CSV: map headers to fields; missing categories become "Uncategorized"

## Deployment
Common JS deployment targets:
- Backend: Heroku, Render, Railway, DigitalOcean App Platform
- Frontend: Vercel, Netlify, or serve static build from the server
- Database: Heroku Postgres, Railway Postgres, or managed Postgres
- Use environment variables for secrets and DB URLs

## Roadmap
- [ ] User accounts & sharing budgets
- [ ] Bank CSV import / auto-categorization
- [ ] Mobile-friendly PWA or native app
- [ ] Automated exchange rate updates
- [ ] Advanced analytics & forecasting

 
